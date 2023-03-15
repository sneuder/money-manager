package models.transactions;

import java.util.UUID;

import models.accounts.Account;

public class Transfer {
  UUID id;
  Account originAccount;
  Account targetAccount;
  float amount;
  String description;

  public Transfer(Account originAccount, Account targetAccount, float amount, String description) {
    this.id = UUID.randomUUID();
    this.originAccount = originAccount;
    this.targetAccount = targetAccount;
    this.amount = amount;
    this.description = description;
  }
}
