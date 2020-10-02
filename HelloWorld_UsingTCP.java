// Way_26 : Using TCP Connection between server and client (your pc is the server and client at the same time)

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloWorld_UsingTCP {

    public static void main(String [] args) throws Exception {
        MyTcp.begin();
    }

    private static final int HELLO_WORLD_LENGTH = 14;

    static class MyTcp {

        static ServerSocket sock;

        public static void begin() throws Exception {
            Socket cliSock;

            try {
                sock = new ServerSocket(9999);
            } catch(IOException ex) {
                System.out.println("Failed to open server socket");
                System.exit(1);
            }

            //thread for client
            new Thread(new TcpClient()).start();

            cliSock = sock.accept();
            //server stills in the same thread
            new TcpServer(cliSock).startServer();
        }
    }

    //client
    static class TcpClient implements Runnable {
        private static InetAddress serverIP;
        private static Socket sock;

        public TcpClient(){
            //empty constructor
        }

        public void run(){
            try {
                //localhost
                serverIP = InetAddress.getByName("127.0.0.1");
            } catch(UnknownHostException ex) {
                System.out.println("Invalid server specified: 127.0.0.1");
                System.exit(1);
            }

            try {
                sock = new Socket(serverIP, 9999);
            } catch(IOException ex) {
                System.out.println("Failed to establish TCP connection");
                System.exit(1);
            }

            DataOutputStream sOut;
            try {
                sOut = new DataOutputStream(sock.getOutputStream());
                String line = "Hello, World!";
                byte [] buf = new byte[HELLO_WORLD_LENGTH];

                int i = 0;
                for(char c : line.toCharArray()){
                    buf[i] = (byte) c;
                    i++;
                }
                sOut.write(buf);
                sock.close();
            } catch (IOException e) {
                System.exit(1);
            }
        }
    }

    //server
    static class TcpServer {
        private Socket s;
        private DataInputStream sIn;

        public TcpServer(Socket clientSock) {
            s = clientSock;
        }

        public void startServer() {
            InetAddress clientIP;

            clientIP = s.getInetAddress();
            System.out.println("New client connection from " + clientIP.getHostAddress() +
                    ", port number " + s.getPort() + "\n---------------------------------------------------\n");
            try {
                sIn = new DataInputStream(s.getInputStream());

                byte [] buf = new byte[HELLO_WORLD_LENGTH];
                sIn.read(buf);
                String line = "";
                for(byte b : buf){
                    line += (char) b;
                }

                System.out.println(line);

                System.out.println("\n---------------------------------------------------\nClient " +
                        clientIP.getHostAddress() + ", port number: " + s.getPort() + " disconnected");
                s.close();
            } catch(IOException ex) {
                System.exit(1);
            }
        }
    }
}
