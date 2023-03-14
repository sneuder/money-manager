package server;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Server {
  static public void start() {
    HttpServer server;
    try {
      server = HttpServer.create(new InetSocketAddress(8000), 0);
      server.createContext("/", (HttpExchange exchange) -> {
        String response = "Hola desde Java!";
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
      });
      server.start();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
