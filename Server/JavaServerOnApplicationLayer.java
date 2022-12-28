import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class JavaServerOnApplicationLayer {

    public static void main(String[] args) throws Exception {
        ServerHttpHandler serverHttpHandler = new ServerHttpHandler();
//        ClientHttpHandler clientHttpHandler = new ClientHttpHandler();
        HttpServer server = HttpServer.create(new InetSocketAddress("127.0.0.1", 8080),2);
        server.createContext("/", serverHttpHandler);
        server.setExecutor(null);
        server.start();
    }
}


