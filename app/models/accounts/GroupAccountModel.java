package models.accounts;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

import java.util.UUID;

@Persistent
public class GroupAccountModel {
  @Id
  public UUID id;
  public String name;
  public String description;

  public GroupAccountModel(String name, String description){
    this.id = UUID.randomUUID();
    this.name = name;
    this.description = description;
  }
}
