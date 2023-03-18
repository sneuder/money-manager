package routes;

import server.Server;
import controllers.GroupAccounts.*;

public class GroupAccounts {
  static public void route() {
    Server.server.createContext("/groupaccounts/get", new GetGroupAccounts());
    Server.server.createContext("/groupaccount/get", new GetGroupAccount());
    Server.server.createContext("/groupaccount/post", new PostGroupAccount());
    Server.server.createContext("/groupaccount/update", new UpdateGroupAccount());
    Server.server.createContext("/groupaccount/delete", new DeleteGroupAccount());
  }
}
