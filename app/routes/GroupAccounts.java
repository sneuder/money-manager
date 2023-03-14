package app.routes;

import server.Server;

public class GroupAccounts {
  static public void route() {
    Server.server.createContext("/groupaccounts", new controllers.GroupAccounts.ShowGroupAccounts());
  }
}
