package dz.spring.second.dao.company;

import dz.spring.second.domain.Company;

import java.util.List;

public interface CompanyDao {
    List<Company> getAll();

    Company getById(Long id);

    void insert(Company company);

    void update(Company company);
}
