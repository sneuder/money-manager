package models.categories.incomes;

import java.util.ArrayList;

public class IncomeCategory {
  String id;
  public String name;
  ArrayList<IncomeSubcategory> subcategories = new ArrayList<IncomeSubcategory>();

  public IncomeCategory(String name){
    this.name = name;
  }

  public void addSubcategory(IncomeSubcategory newSubcategory) {
    subcategories.add(newSubcategory);
  }
}
