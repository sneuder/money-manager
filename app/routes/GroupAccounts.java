package routes;

import server.Server;
import controllers.GroupAccounts.*;

public class GroupAccounts {
  static public void route() {
    Server.server.createContext("/groupaccount/post", new PostGroupAccount());
  }
}
