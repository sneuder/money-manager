package models.accounts;

public class Account {
  String id;
  String name;
  float amount;
  String description;
  String groupAccount;  

  public Account(String name, float amount, String description, String groupAccount ) {
    this.name = name;
    this.amount = amount;
    this.description = description;
    this.groupAccount = groupAccount;
  }
}
