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
import services.HTTPParams;
import services.HTTPResponse;
import services.HTTPValidator;

public class GroupAccounts {
  static MoneyManager database = App.database;

  static public class GetGroupAccounts implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      if (!HTTPValidator.validateRoute(exchange, "GET", "/groupaccounts"))
        return;

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

      String json = ToJSON.convert(new Message(true, "group account created"));
      HTTPResponse.send(exchange, json);
    }
  }

  static public class DeleteGroupAccount implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      String id = HTTPParams.getParam(exchange);
      String path = String.format("/groupaccounts/%s", id);
      System.out.println(path);
      if (!HTTPValidator.validateRoute(exchange, "DELETE", path))
        return;

      String json = ToJSON.convert(new Message(true, "group account deleted"));
      HTTPResponse.send(exchange, json);
    }
  }
}
