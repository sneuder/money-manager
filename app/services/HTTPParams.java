package services;

import com.sun.net.httpserver.HttpExchange;

public class HTTPParams {
  static public String getParam(HttpExchange exchange) {
    String[] path = exchange.getRequestURI().getPath().split("/");
    String id = path[path.length - 1];
    return id;
  }
}
