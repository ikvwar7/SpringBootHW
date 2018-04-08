package dz.spring.second.dao.owner;

import dz.spring.second.domain.Owner;

import java.util.List;

public interface OwnerDao {
    Owner getById(Long id);

    List<Owner> getAll();

    List<Owner> getAllByCompanyId(Long companyId);

    void insert(Owner owner);

    void update(Owner owner);
}
