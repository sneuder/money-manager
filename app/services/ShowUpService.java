package app.services;

import app.App;
import app.models.accounts.GroupAccount;

public class ShowUpService {
  public static void showMenu() {
    System.out.println("====================");
    System.out.println("1. Transactions");
    System.out.println("2. New transactions");
    System.out.println("3. Remove transactions");
    System.out.println("4. More options");
  }

  public static void showTransactions() {

  }

  public static void showGroupAccounts() {
    for (GroupAccount groupAccount : App.database.groupAccounts) {
      System.out.println(groupAccount.name);
    }
  }
}
