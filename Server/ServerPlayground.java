import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


// Right now it is fetching from the server side from the begining. Also, not letting the user enter anything.
// Either have to create a different client server to interact with the server or have to implement queue to fetch the last line.
// first option is better bcz it is not letting the client enter anything.

public class ServerPlayground {
    public static void serverSetUp(){
        try{
            ServerSocket serverSocket = new ServerSocket(8080);
            while(true) {
                Socket clientSocket = serverSocket.accept();
                InputStream request = clientSocket.getInputStream();
                OutputStream response = clientSocket.getOutputStream();
//                BufferedReader requestToServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                Scanner requestToServer = new Scanner(request);
                PrintWriter responseToServer = new PrintWriter(response);
                String printText = "Enter your name";
//                String text = "Hello Server!!";
//                System.out.println(text);
                responseToServer.println("HTTP/1.1 200 OK");
                responseToServer.println("Content-Type : text/plain");
                responseToServer.println("Content-Length : " + printText.length());
                responseToServer.println("");
                responseToServer.println(printText);
//                responseToServer.println("");
                requestToServer.nextLine();
//                requestToServer.
                String text= requestToServer.nextLine();
                responseToServer.println("Hi " + text);
                responseToServer.println("Mission successfull!!");
//                responseToServer.println("");
//                text = requestToServer.readLine();
//                String textcheck = requestToServer.
//                responseToServer.println("Hi");
//                responseToServer.print(text);
                responseToServer.flush();
                responseToServer.close();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        serverSetUp();
    }

}
