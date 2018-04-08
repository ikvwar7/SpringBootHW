package dz.spring.second.service;

import dz.spring.second.dao.company.CompanyDao;
import dz.spring.second.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    public Company save(Company company) {
        try {
            long id = company.getId();
            Company comp = companyDao.getById(id);
            companyDao.update(company);
        }
        catch (EmptyResultDataAccessException e) {
            companyDao.insert(company);
        }
        return company;
    }

    public Company getById(Long id) {
        return companyDao.getById(id);
    }

    public List<Company> getAll() {
        return companyDao.getAll();
    }

}
