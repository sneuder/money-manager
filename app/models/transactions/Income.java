package models.transactions;

import java.util.UUID;

import models.accounts.Account;
import models.categories.incomes.IncomeCategory;
import models.categories.incomes.IncomeSubcategory;

public class Income {
  UUID id;
  Account account;
  IncomeCategory incomeCategory;
  IncomeSubcategory incomeSubcategory;
  float amount;
  String description;

  public Income(
    Account account,
    IncomeCategory incomeCategory,
    IncomeSubcategory incomeSubcategory,
    float amount,
    String description
  ) {
    this.id = UUID.randomUUID();
    this.account = account;
    this.incomeCategory = incomeCategory;
    this.incomeSubcategory = incomeSubcategory;
    this.amount = amount;
    this.description = description;
  }
}
