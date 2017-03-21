import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by codecadet on 28/02/17.
 */
public class Client {
    private Socket socket;
    private BufferedReader inData;
    private PrintWriter outData;
    private String message;
    private String user;

    @Override
    public String toString() {
        return user + " Sent: ";
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose User: ");
        user = scanner.nextLine();

        try {
            socket = new Socket("skynet", 9090);
            while (true) {
                Thread thread = new Thread(new ServerListener());
                thread.start();
                System.out.println("Thread: " + thread.getThreadGroup().getName());
                outData = new PrintWriter(socket.getOutputStream());
                reading();
                outMessage(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String reading() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Message: ");
        message = scanner.nextLine();
        if (message.equals("/quit")) {
            try {
                System.out.println("Will close in the future");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return message;

    }


    public void outMessage(String message) {
        outData.println(toString() + message);
        outData.flush();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private class ServerListener implements Runnable {
        public ServerListener() {
            try {
                inData = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            incomeMessage();
        }

        public String incomeMessage() {
            String line = null;
            try {
                while ((line = inData.readLine()) != null && !line.isEmpty()) {
                    line = line + "\n";
                    System.out.println(line);
                    System.out.println("Write Message: ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }

    }

}
