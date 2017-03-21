package bootcamp;

import java.io.*;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by codecadet on 26/02/17.
 */
public class Client implements Runnable {

    private Socket socket;
    private BufferedReader inData;
    private DataOutputStream outData;
    private FileInputStream fileInputStream;

    public Client(Socket client) {
        this.socket = client;
    }

    @Override
    public void run() {
        try {
            getContent(socket);
            System.out.println(Thread.currentThread().getName());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void getContent(Socket clientSocket) throws IOException {
        inData = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        outData = new DataOutputStream(clientSocket.getOutputStream());

        String requestHeaders = getRequestHeaders(inData);
        String request = requestHeaders.split("\n")[0];

        System.out.println("Requisição " + request);
        String httpVerb = request.split(" ")[0];
        String resource = request.split(" ").length > 1 ? request.split(" ")[1] : null;
        String filePath = getPathForResource(resource);
        File file = new File(filePath);

        if (request != null && !request.isEmpty()) {

            if (resource == null) {
                reply(outData, HttpHelper.badRequest());
                close(clientSocket);
                return;
            }
            if (requestHeaders.isEmpty()) {
                close(clientSocket);
                return;
            }

            if (!httpVerb.equals("GET")) {
                reply(outData, HttpHelper.notAllowed());
                close(clientSocket);
                return;
            }


            if (!HttpMedia.isSupported(filePath)) {
                reply(outData, HttpHelper.unsupportedMedia());
                close(clientSocket);
                return;
            }

            if (file.exists() && !file.isDirectory()) {
                reply(outData, HttpHelper.ok());

            } else {
                reply(outData, HttpHelper.notFound());
                filePath = WebServer.DOCUMENT_ROOT + "/404.html";
                file = new File(filePath);

            }

            reply(outData, HttpHelper.contentType(filePath));
            reply(outData, HttpHelper.contentLength(file.length()));

            streamFile(outData, file);
            close(clientSocket);
        }

    }

    private void streamFile(DataOutputStream outData, File file) throws IOException {

        byte[] buffer = new byte[1024];
        fileInputStream = new FileInputStream(file);
        int numChars;
        while ((numChars = fileInputStream.read(buffer)) != -1) {
            outData.write(buffer, 0, numChars);
        }


    }

    private String getPathForResource(String resource) {
        String filePath = resource;

        System.out.println(filePath);

        Pattern pattern = Pattern.compile("(\\.[^.]+)$");
        Matcher matcher = pattern.matcher(filePath);

        if (!matcher.find()) {
            filePath += "/index.html";
        }

        filePath = WebServer.DOCUMENT_ROOT + filePath;

        return filePath;
    }

    private String getRequestHeaders(BufferedReader inData) throws IOException {
        String line = null;
        StringBuilder builder = new StringBuilder();

        // read the full http request
        while ((line = inData.readLine()) != null && !line.isEmpty()) {
            builder.append(line + "\n");
        }
        //  System.out.println(builder);

        return builder.toString();
    }

    private void reply(DataOutputStream outData, String answer) throws IOException {
        outData.writeBytes(answer);

    }

    private void close(Socket clientSocket) throws IOException {
        clientSocket.close();
    }
}
