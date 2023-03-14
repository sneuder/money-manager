package models.categories.expenses;

public class ExpenseSubcategory {
  String id;
  String name;
  String expenseCategory;

  public ExpenseSubcategory(String name, String expenseCategory) {
    this.name = name;
    this.expenseCategory = expenseCategory;
  }
}
