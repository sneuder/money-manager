package models.categories.expenses;

import java.util.ArrayList;
import java.util.UUID;

public class ExpenseCategory {
  UUID id;
  public String name;
  ArrayList<ExpenseSubcategory> subCategories = new ArrayList<ExpenseSubcategory>();

  public ExpenseCategory(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
  }

  public void addSubcategory(ExpenseSubcategory newSubCategory){ 
    this.subCategories.add(newSubCategory);
  }
}
