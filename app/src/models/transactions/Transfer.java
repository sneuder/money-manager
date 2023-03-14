package models.transactions;

import models.accounts.Account;

public class Transfer {
  String id;
  Account originAccount;
  Account targetAccount;
  float amount;
  String description;

  public Transfer(Account originAccount, Account targetAccount, float amount, String description) {
    this.originAccount = originAccount;
    this.targetAccount = targetAccount;
    this.amount = amount;
    this.description = description;
  }
}
