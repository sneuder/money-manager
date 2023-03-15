package models.accounts;

import java.util.ArrayList;

public class GroupAccount {
  String id;
  public String name;
  String description;
  ArrayList<Account> accounts = new ArrayList<Account>();

  public GroupAccount(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void addAccount(Account newAccount) {
    this.accounts.add(newAccount);;
  }

  public void removeAccount(String idAccount) {

  }
}
