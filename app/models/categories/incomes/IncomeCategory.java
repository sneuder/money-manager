package models.categories.incomes;

import java.util.ArrayList;
import java.util.UUID;

public class IncomeCategory {
  UUID id;
  public String name;
  ArrayList<IncomeSubcategory> subcategories = new ArrayList<IncomeSubcategory>();

  public IncomeCategory(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
  }

  public void addSubcategory(IncomeSubcategory newSubcategory) {
    subcategories.add(newSubcategory);
  }
}
