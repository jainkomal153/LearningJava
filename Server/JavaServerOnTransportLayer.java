import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServerOnTransportLayer {

    public static void connectToServer(){
        try (ServerSocket serverSocket = new ServerSocket(8080)){
            while (true) {
                Socket socket = serverSocket.accept();
                OutputStream response = socket.getOutputStream();
                String responseText = "<h1>Hello World</h1>";
            PrintWriter responseFromServer = new PrintWriter(new OutputStreamWriter(response, "UTF-8"),true);
            responseFromServer.println("HTTP/1.1 200 OK");
            responseFromServer.println("Content-Type: text/html");
            responseFromServer.println("Content-Length: " + responseText.length());
            responseFromServer.println();
            responseFromServer.println(responseText);
            responseFromServer.flush();
            responseFromServer.close();
            socket.close();
//            responseFromServer.write();


//                dataOutputStream.writeBytes("HTTP/1.1 200 OK\r\n");
//                dataOutputStream.writeBytes("Content-Type: text/html\r\n");
//                dataOutputStream.writeBytes("Content-Length: " + responseText.length() + "\r\n\r\n");
//                dataOutputStream.writeBytes(responseText);
//                dataOutputStream.flush();
//                dataOutputStream.close();
//                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        connectToServer();
    }
}
