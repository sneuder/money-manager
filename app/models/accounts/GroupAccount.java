package models.accounts;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.*;
import java.lang.reflect.Field;

public class GroupAccount {
  public UUID id;
  public String name;
  public String description;
  public ArrayList<Account> accounts = new ArrayList<Account>();

  public GroupAccount(String name, String description) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.description = description;
  }

  public void updateGroupAccount(GroupAccount newValues) throws IllegalAccessException {
    Field[] fields = this.getClass().getDeclaredFields();

    for (Field field : fields) {
      field.setAccessible(true);
      Object newValue = field.get(newValues);
      if (newValue != null) field.set(this, newValue);
    }
  }

  public void addAccount(Account newAccount) {
    this.accounts.add(newAccount);
  }

  public void removeAccount(String id) {
    UUID idAccount = UUID.fromString(id);
    this.accounts = this.accounts.stream()
      .filter((account) -> !account.id.equals(idAccount))
      .collect(Collectors.toCollection(ArrayList::new));
  }

  public Account findAccountById(String id) {
    UUID idAccount = UUID.fromString(id);
    Account foundAccount = this.accounts.stream()
      .filter((account) -> account.id.equals(idAccount))
      .findFirst()
      .orElse(null);

    return foundAccount;
  }
}
