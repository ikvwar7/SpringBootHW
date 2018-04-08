package dz.spring.second.service;

import dz.spring.second.dao.owner.OwnerDao;
import dz.spring.second.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OwnerService {

    @Autowired
    private OwnerDao ownerDao;

    public Owner save(Owner owner) {
        try {
            long id = owner.getId();
            Owner own = ownerDao.getById(id);
            ownerDao.update(owner);
        }
        catch (EmptyResultDataAccessException e) {
            ownerDao.insert(owner);
        }
        return owner;
    }

    public Owner getById(Long id) {
        return ownerDao.getById(id);
    }

    public List<Owner> getAll() {
        return ownerDao.getAll();
    }

    public List<Owner> getAllByCompanyId(Long companyId) {
        return ownerDao.getAllByCompanyId(companyId);
    }
}
