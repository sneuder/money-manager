package database;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.*;

import models.accounts.GroupAccountModel;
import models.categories.expenses.ExpenseCategory;
import models.categories.incomes.IncomeCategory;
import models.transactions.Transaction;

public class MoneyManager {
  String id;
  String databaseName;

  public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
  public ArrayList<GroupAccountModel> groupAccounts = new ArrayList<GroupAccountModel>();
  public ArrayList<IncomeCategory> incomeCategories = new ArrayList<IncomeCategory>();
  public ArrayList<ExpenseCategory> expenseCategories = new ArrayList<ExpenseCategory>();

  public MoneyManager(String databaseName) {
    this.databaseName = databaseName;
  }
}
