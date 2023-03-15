package models.categories.expenses;

import java.util.UUID;

public class ExpenseSubcategory {
  UUID id;
  String name;
  String expenseCategory;

  public ExpenseSubcategory(String name, String expenseCategory) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.expenseCategory = expenseCategory;
  }
}
