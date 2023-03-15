package controllers;

import constants.ToJSON;
import constants.Message;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import app.App;

import database.MoneyManager;
import models.accounts.GroupAccount;
import services.HTTPResponse;

public class GroupAccounts {
  static MoneyManager database = App.database;

  static public class GetGroupAccounts implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      ArrayList<GroupAccount> response = database.groupAccounts;
      String json = ToJSON.convert(response);
      HTTPResponse.send(exchange, json);
    }
  }

  static public class PostGroupAccount implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      InputStream requestBody = exchange.getRequestBody();

      Object newGroupAccount = ToJSON.bodyJson(requestBody, GroupAccount.class);
      database.groupAccountAdd((GroupAccount) newGroupAccount);

      String json = ToJSON.convert(new Message(true, "account group created"));
      HTTPResponse.send(exchange, json);
    }
  }
}
