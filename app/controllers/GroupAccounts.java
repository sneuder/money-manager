package controllers;

import constants.ToJSON;
import constants.Message;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;


import models.accounts.GroupAccountModel;
import database.GroupAccountDB;
import services.HTTPResponse;

public class GroupAccounts {

  static public class PostGroupAccount implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      InputStream requestBody = exchange.getRequestBody();

      GroupAccountModel draftGroupAccount = (GroupAccountModel) ToJSON.bodyJson(requestBody, GroupAccountModel.class);

      // GroupAccountModel newGroupAccount = new GroupAccountModel(
      //   draftGroupAccount.name,
      //   draftGroupAccount.description
      // );

      // GroupAccountDB.addGroupAccount(newGroupAccount);

      String json = ToJSON.convert(new Message(true, "group account created"));
      HTTPResponse.send(exchange, json);
    }
  }

  // static public class UpdateGroupAccount implements HttpHandler {
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

  // static public class DeleteGroupAccount implements HttpHandler {
  //   @Override
  //   public void handle(HttpExchange exchange) throws IOException {
  //     String id = HTTPParams.getParam(exchange);
  //     database.groupAccountRemove(id);
  //     String json = ToJSON.convert(new Message(true, "group account deleted"));
  //     HTTPResponse.send(exchange, json);
  //   }
  // }
}
