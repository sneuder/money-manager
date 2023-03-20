package controllers;

import constants.ToJSON;
import constants.Message;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;

import app.App;

import database.MoneyManager;
import models.accounts.GroupAccountModel;
import models.accounts.Account;
import services.HTTPParams;
import services.HTTPResponse;

public class Accounts {
  static MoneyManager database = App.database;

  // static public class GetAccounts implements HttpHandler {
  //   @Override
  //   public void handle(HttpExchange exchange) throws IOException {
  //     String id = HTTPParams.getParam(exchange);
  //     GroupAccount foundGroupAccount = database.groupAccountFindOne(id);
  //     String json = ToJSON.convert(foundGroupAccount.accounts);
  //     HTTPResponse.send(exchange, json);
  //   }
  // }

  // static public class GetAccount implements HttpHandler {
  //   @Override
  //   public void handle(HttpExchange exchange) throws IOException {
  //     String id = HTTPParams.getParam(exchange);
      
  //     GroupAccount foundGroupAccount = database.groupAccountFindOne(id);
  //     Account foundAccount = foundGroupAccount.findAccountById(id);

  //     String json = ToJSON.convert(foundAccount);
  //     HTTPResponse.send(exchange, json);
  //   }
  // }

  // static public class PostAccount implements HttpHandler {
  //   @Override
  //   public void handle(HttpExchange exchange) throws IOException {
  //     String id = HTTPParams.getParam(exchange);
  //     InputStream requestBody = exchange.getRequestBody();

  //     GroupAccount foundGroupAccount = database.groupAccountFindOne(id);
  //     Account draftAccount = (Account) ToJSON.bodyJson(requestBody, Account.class);
  //     Account newAccount = new Account(draftAccount.name, 0, draftAccount.description, foundGroupAccount.description);

  //     foundGroupAccount.addAccount(newAccount);

  //     String json = ToJSON.convert(new Message(true, "account created"));
  //     HTTPResponse.send(exchange, json);
  //   }
  // }

  // static public class UpdateAccount implements HttpHandler {
  //   @Override
  //   public void handle(HttpExchange exchange) throws IOException {
  //     String id = HTTPParams.getParam(exchange);
  //     InputStream requestBody = exchange.getRequestBody();
  //     Object valuesToUpdate = ToJSON.bodyJson(requestBody, GroupAccount.class);

  //     GroupAccount groupAccountToUpdate = database.groupAccountFindOne(id);
  //     try {
  //       groupAccountToUpdate.updateGroupAccount((GroupAccount) valuesToUpdate);
  //     } catch (IllegalAccessException e) {
  //       e.printStackTrace();
  //     }

  //     String json = ToJSON.convert(new Message(true, "group account updated"));
  //     HTTPResponse.send(exchange, json);
  //   }
  // }

  // static public class DeleteAccount implements HttpHandler {
  //   @Override
  //   public void handle(HttpExchange exchange) throws IOException {
  //     String id = HTTPParams.getParam(exchange);
  //     database.groupAccountRemove(id);
  //     String json = ToJSON.convert(new Message(true, "group account deleted"));
  //     HTTPResponse.send(exchange, json);
  //   }
  // }
}
