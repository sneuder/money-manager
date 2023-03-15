package services;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import constants.Message;
import constants.ToJSON;

public class HTTPValidator {
  static public Boolean validateRoute(HttpExchange exchange, String method, String path) throws IOException {
    String reqMethod = exchange.getRequestMethod();
    String reqPath = exchange.getRequestURI().getPath();

    if (reqMethod.equals(method) && reqPath.equals(path)) {
      return true;
    }

    String json = ToJSON.convert(new Message(false, "invalid route"));
    HTTPResponse.send(exchange, json);
    return false;
  }
}
