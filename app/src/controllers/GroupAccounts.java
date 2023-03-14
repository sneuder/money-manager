package controllers;

import com.google.gson.Gson;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import app.App;
import database.MoneyManager;
import models.accounts.GroupAccount;

public class GroupAccounts {
  static MoneyManager database = App.database;

  static public class ShowGroupAccounts implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      ArrayList<GroupAccount> response = database.groupAccounts;
      // exchange.sendResponseHeaders(200, response.size());
      //
      Gson gson = new Gson();
      String json = gson.toJson(response);

      exchange.sendResponseHeaders(200, json.getBytes().length);

      OutputStream os = exchange.getResponseBody();
      // os.write(response.getBytes());
      os.close();
    }
  }
}
