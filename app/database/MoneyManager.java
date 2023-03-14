package app.database;

import java.util.ArrayList;

import app.models.accounts.GroupAccount;
import app.models.categories.expenses.ExpenseCategory;
import app.models.categories.incomes.IncomeCategory;
import app.models.transactions.Transaction;

public class MoneyManager {
  String id;
  String databaseName;

  public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
  public ArrayList<GroupAccount> groupAccounts = new ArrayList<GroupAccount>();
  public ArrayList<IncomeCategory> incomeCategories = new ArrayList<IncomeCategory>();
  public ArrayList<ExpenseCategory> expenseCategories = new ArrayList<ExpenseCategory>();

  public MoneyManager(String databaseName) {
    this.databaseName = databaseName;
  }

  public void transactionAdd() {

  }

  public void transactionRemove(){

  }

  public void groupAccountAdd(GroupAccount newGroupAccount) {
    this.groupAccounts.add(newGroupAccount);
  }

  public void groupAccountRemove() {

  }

  public void incomeCategoryAdd(IncomeCategory newIncomeCategory) {
    this.incomeCategories.add(newIncomeCategory);
  }

  public void incomeCategoryRemove() {

  }

  public void expenseCategoryAdd(ExpenseCategory newExpenseCategory) {
    this.expenseCategories.add(newExpenseCategory);
  }

  public void expenseCategoryRemove() {
    
  }
}
