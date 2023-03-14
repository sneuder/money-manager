package app;

import database.MoneyManager;
import server.Server;

public class App {
  public static MoneyManager database = new MoneyManager("money-manager");

  public static void main(String[] args) {
    Server.start();
  }
}