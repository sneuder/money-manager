package models.categories.expenses;

import java.util.ArrayList;

public class ExpenseCategory {
  String id;
  public String name;
  ArrayList<ExpenseSubcategory> subCategories = new ArrayList<ExpenseSubcategory>();

  public ExpenseCategory(String name) {
    this.name = name;
  }

  public void addSubcategory(ExpenseSubcategory newSubCategory){ 
    this.subCategories.add(newSubCategory);
  }
}
