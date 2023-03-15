package models.transactions;

import java.util.UUID;

public class Transaction {
  UUID id;
  float amount;
  Object transaction;

  public Transaction(Object transaction) {
    this.id = UUID.randomUUID();
    this.transaction = transaction;
  }

}
