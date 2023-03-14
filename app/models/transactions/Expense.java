package app.models.transactions;

import app.models.accounts.Account;
import app.models.categories.expenses.ExpenseCategory;
import app.models.categories.expenses.ExpenseSubcategory;

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
