package models.accounts;

import java.util.ArrayList;
import java.util.UUID;

public class GroupAccount {
  public UUID id;
  public String name;
  String description;
  ArrayList<Account> accounts = new ArrayList<Account>();

  public GroupAccount(String name, String description) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.description = description;
  }

  public void addAccount(Account newAccount) {
    this.accounts.add(newAccount);;
  }

  public void removeAccount(String idAccount) {

  }
}
