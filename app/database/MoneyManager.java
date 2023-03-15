package database;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.*;

import models.accounts.GroupAccount;
import models.categories.expenses.ExpenseCategory;
import models.categories.incomes.IncomeCategory;
import models.transactions.Transaction;

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

  public void groupAccountRemove(String id) {
    UUID idGA = UUID.fromString(id);
    this.groupAccounts = groupAccounts.stream()
      .filter((groupAccount) -> !groupAccount.id.equals(idGA))
      .collect(Collectors.toCollection(ArrayList::new));
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
