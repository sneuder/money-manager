package server;

import controllers.GroupAccounts;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class Server {
  public static HttpServer server;

  static public void start() {
    try {
      GroupAccounts.ShowGroupAccounts controller = new GroupAccounts.ShowGroupAccounts();
      server = HttpServer.create(new InetSocketAddress(8000), 0);
      server.createContext("/", controller);
      server.start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
