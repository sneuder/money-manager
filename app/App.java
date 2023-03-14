package app;

import app.database.MoneyManager;
import app.server.Server;
import app.services.SetUp;

public class App {
  public static MoneyManager database = new MoneyManager("money-manager");

  public static void main(String[] args) {
    SetUp.setDefaults(database);
    Server.start();
  }
}