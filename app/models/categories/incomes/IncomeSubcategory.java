package models.categories.incomes;

import java.util.UUID;

public class IncomeSubcategory {
  UUID id;
  String name;
  String incomeCategory;

  public IncomeSubcategory(String name, String incomeCategory) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.incomeCategory = incomeCategory;
  }
}
