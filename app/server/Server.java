package server;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

import routes.GroupAccounts;

public class Server {
  public static HttpServer server;

  static public void start() {
    try {
      server = HttpServer.create(new InetSocketAddress(8000), 0);
      // establish routes
      GroupAccounts.route();
      
      server.start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
