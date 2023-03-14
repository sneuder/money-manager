package services;

import database.MoneyManager;

import models.accounts.Account;
import models.accounts.GroupAccount;

import models.categories.expenses.ExpenseCategory;
import models.categories.expenses.ExpenseSubcategory;

import models.categories.incomes.IncomeCategory;
import models.categories.incomes.IncomeSubcategory;

public class SetUp {
  static GroupAccount defaultGroup = new GroupAccount("my accounts", null);
  static IncomeCategory defaultIncomeCategory = new IncomeCategory("Job");
  static ExpenseCategory defaultExpenseCategory = new ExpenseCategory("Job");
  static MoneyManager database;

  public static void setDefaults(MoneyManager databaseDefault) {
    database = databaseDefault;
    accounts();
    expenses();
    incomes();
    database();
  }

  static void accounts() {
    Account firstAccount = new Account("Home", 0, null, defaultGroup.name);
    Account secondAccount = new Account("Services", 0, null, defaultGroup.name);
    Account thirdAccount = new Account("Grocery", 0, null, defaultGroup.name);

    defaultGroup.addAccount(firstAccount);
    defaultGroup.addAccount(secondAccount);
    defaultGroup.addAccount(thirdAccount);
  }

  static void expenses() {
    ExpenseSubcategory firstExpenseSubCategory = new ExpenseSubcategory("Google", defaultExpenseCategory.name);
    ExpenseSubcategory secondExpenseSubCategory = new ExpenseSubcategory("IBM", defaultExpenseCategory.name);
    ExpenseSubcategory thirdExpenseSubCategory = new ExpenseSubcategory("Microft", defaultExpenseCategory.name);

    defaultExpenseCategory.addSubcategory(firstExpenseSubCategory);
    defaultExpenseCategory.addSubcategory(secondExpenseSubCategory);
    defaultExpenseCategory.addSubcategory(thirdExpenseSubCategory);
  }

  static void incomes() {
    IncomeSubcategory firstIncomeSubCategory = new IncomeSubcategory("Google", defaultIncomeCategory.name);
    IncomeSubcategory secondIncomeSubCategory = new IncomeSubcategory("IBM", defaultIncomeCategory.name);
    IncomeSubcategory thirdIncomeSubCategory = new IncomeSubcategory("Microft", defaultIncomeCategory.name);

    defaultIncomeCategory.addSubcategory(firstIncomeSubCategory);
    defaultIncomeCategory.addSubcategory(secondIncomeSubCategory);
    defaultIncomeCategory.addSubcategory(thirdIncomeSubCategory);
  }

  static void database() {
    database.groupAccountAdd(defaultGroup);
    database.incomeCategoryAdd(defaultIncomeCategory);
    database.expenseCategoryAdd(defaultExpenseCategory);
  }
}
