import database.MoneyManager;

import services.SetUp;
import services.ShowUpService;

public class App {
  static MoneyManager database = new MoneyManager("money-manager");

  public static void main(String[] args) {
    ShowUpService.showMenu();
    SetUp.setDefaults(database);
  }
}