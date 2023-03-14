package models.transactions;

import models.accounts.Account;
import models.categories.expenses.ExpenseCategory;
import models.categories.expenses.ExpenseSubcategory;

public class Expense {
  String id;
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
    this.account = account;
    this.expenseCategory = expenseCategory;
    this.expenseSubCategory = expenseSubcategory;
    this.amount = amount;
    this.description = description;
  }
}
