package repositories;

import org.springframework.data.repository.CrudRepository;
import models.accounts.GroupAccountModel;

public interface GroupAccountRepository extends CrudRepository<GroupAccountModel, Integer> {
}
