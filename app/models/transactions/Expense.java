package models.transactions;

import java.util.UUID;

import models.accounts.Account;
import models.categories.expenses.ExpenseCategory;
import models.categories.expenses.ExpenseSubcategory;

public class Expense {
  UUID id;
  Account account;
  ExpenseCategory expenseCategory;
  ExpenseSubcategory expenseSubCategory;
  float amount;
  String description;

  public Expense(
    Account account,
    ExpenseCategory expenseCategory,
    ExpenseSubcategory expenseSubcategory,
    float amount,
    String description
  ) {
    this.id = UUID.randomUUID();
    this.account = account;
    this.expenseCategory = expenseCategory;
    this.expenseSubCategory = expenseSubcategory;
    this.amount = amount;
    this.description = description;
  }
}
