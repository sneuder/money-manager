package app.models.transactions;

import app.models.accounts.Account;
import app.models.categories.incomes.IncomeCategory;
import app.models.categories.incomes.IncomeSubcategory;

public class Income {
  String id;
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
    this.account = account;
    this.incomeCategory = incomeCategory;
    this.incomeSubcategory = incomeSubcategory;
    this.amount = amount;
    this.description = description;
  }
}
