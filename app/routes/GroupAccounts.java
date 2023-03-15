package routes;

import server.Server;
import controllers.GroupAccounts.*;

public class GroupAccounts {
  static public void route() {
    Server.server.createContext("/groupaccounts", new GetGroupAccounts());
    Server.server.createContext("/groupaccount", new PostGroupAccount());
    Server.server.createContext("/groupaccount/{id}", new DeleteGroupAccount());
  }
}
