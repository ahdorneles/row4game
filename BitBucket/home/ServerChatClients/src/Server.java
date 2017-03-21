import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by codecadet on 28/02/17.
 */
public class Server {
    private ServerSocket serverSocket;
    private CopyOnWriteArrayList<Socket> copyOnWriteArrayList;


    public void start() {
        try {
            System.out.println("Starting server");

            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            serverSocket = new ServerSocket(9090);


            while (true) {


                Socket socket = serverSocket.accept();
                copyOnWriteArrayList.add(socket);
                Thread thread = new Thread(new ClientHandler(socket));
                thread.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void answerAll(String line) throws IOException {
        synchronized (copyOnWriteArrayList) {
            Iterator<Socket> it = copyOnWriteArrayList.iterator();

            while (it.hasNext()) {
                Socket socketToSend = it.next();
                System.out.println("Sockets: " + socketToSend.toString());
                if(socketToSend.equals(getServerSocket())){
                    System.out.println("I am in an");
                    continue;
                }
                socketToSend.getOutputStream().write(line.getBytes());
                socketToSend.getOutputStream().flush();
            }
        }

    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private class ClientHandler implements Runnable {
        private BufferedReader inData;
        private String line;


        public ClientHandler(Socket socket) throws IOException {

            inData = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        }


        public void getAnswer() throws IOException {
            while (true) {

                line = null;
                while ((line = inData.readLine()) != null && !line.isEmpty()) {
                    line = line + "\n";
                    answerAll(line);
                }
            }
        }

        @Override
        public void run() {
            while (true) {
                try {
                    getAnswer();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
