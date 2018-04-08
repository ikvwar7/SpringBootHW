package dz.spring.second.dao.account;

import dz.spring.second.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> getAll();

    Account getById(Long id);

    List<Account> getAllByOwnerId(Long ownerId);

    Account insert(Account account);

    Account update(Account account);
}
