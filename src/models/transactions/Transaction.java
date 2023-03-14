package models.transactions;

public class Transaction {
  String id;
  float amount;
  Object transaction;

  public Transaction(Object transaction) {
    this.transaction = transaction;
  }

}
