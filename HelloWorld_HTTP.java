import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class HelloWorld_HTTP {
    public static void main(String[] args) throws Exception {
        try (ServerSocket serverConnect = new ServerSocket(80)) {
            Socket socket = serverConnect.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String helloWorld = "<title>Hello World!</title><h1>Hello World!</h1>";
            out.println("HTTP/1.1 200 OK");
            out.println("Server: Hello World Server");
            out.println("Date: " + new Date());
            out.println("Content-type: text/html");
            out.println("Content-length: " + helloWorld.length());
            out.println();
            out.println(helloWorld);
            out.flush();
        }
    }
}
