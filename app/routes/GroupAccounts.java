package app.routes;

import app.server.Server;
import app.controllers.GroupAccounts.*;

public class GroupAccounts {
  static public void route() {
    Server.server.createContext("/groupaccounts", new ShowGroupAccounts());
  }
}
