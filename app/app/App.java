package app;

import database.MoneyManager;
import server.Server;
import services.SetUp;

public class App {
  public static MoneyManager database = new MoneyManager("money-manager");

  public static void main(String[] args) {
    SetUp.setDefaults(database);
    Server.start();
  }
}