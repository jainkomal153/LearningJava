import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ServerHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        ClientHttpHandler clientHttpHandler = new ClientHttpHandler();

        String response = "Hi There!, I am Server";
        String response2 = "Hi Client!";
        String notFound = "Not found";

        if (!exchange.getRequestURI().getPath().equals("/helloWorld")) {
            exchange.sendResponseHeaders(404, notFound.length());
            try(OutputStream os = exchange.getResponseBody()) {
                os.write(notFound.getBytes());
            }
            return;
        }
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
//                os.close();
        clientHttpHandler.handle(exchange);
        exchange.getRequestHeaders();
        InputStream request = exchange.getRequestBody();
        Scanner scan = new Scanner(System.in);
        request.read(scan.nextLine().getBytes());
        exchange.sendResponseHeaders(200, response2.length());
        os.write(response2.getBytes());
        os.close();


    }
}
