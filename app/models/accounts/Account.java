package models.accounts;

import java.util.UUID;

public class Account {
  public UUID id;
  public String name;
  float amount;
  public String description;
  String groupAccount;

  public Account(String name, float amount, String description, String groupAccount) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.amount = amount;
    this.description = description;
    this.groupAccount = groupAccount;
  }
}
