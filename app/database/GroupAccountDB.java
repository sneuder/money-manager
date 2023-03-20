package database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.GroupAccountRepository;
import models.accounts.GroupAccountModel;

@Service
public class GroupAccountDB {
  @Autowired
  static GroupAccountRepository groupAccountRepository;  

  static public void addGroupAccount(GroupAccountModel newGroupAccount) {
    groupAccountRepository.save(newGroupAccount);
  }
}
