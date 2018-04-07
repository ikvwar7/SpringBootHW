package dz.spring.second.service;

import dz.spring.second.dao.AccountDao.AccountDao;
import dz.spring.second.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public Account save(Account account) {
        try {
            long id = account.getId();
            Account acc = accountDao.getById(id);
            accountDao.update(account);
        }
        catch (EmptyResultDataAccessException e) {
            accountDao.insert(account);
        }
        return account;
    }

    public Account getById(Long id) {
        return accountDao.getById(id);
    }

    public List<Account> getAll() {
        return accountDao.getAll();
    }

    public List<Account> getAllByOwnerId(Long ownerId) {
        return accountDao.getAllByOwnerId(ownerId);
    }
}
