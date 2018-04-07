package dz.spring.second.dao.OwnerDao;

import dz.spring.second.dao.AccountDao.AccountRowMapper;
import dz.spring.second.dao.CompanyDao.CompanyRowMapper;
import dz.spring.second.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OwnerDaoJdbc implements OwnerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Owner getById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM Owner WHERE id=?", new OwnerRowMapper(), id);
    }

    @Override
    public List<Owner> getAll() {
        return jdbcTemplate.query("SELECT * FROM Owner", new OwnerRowMapper());
    }

    @Override
    public List<Owner> getAllByCompanyId(Long companyId) {
        return jdbcTemplate.query("SELECT * FROM Owner WHERE companyId=?", new OwnerRowMapper(), companyId);
    }

    @Override
    public void insert(Owner owner) {
        jdbcTemplate.update("Insert into Owner (id,companyId,firstName,lastName) VALUES (?,?,?,?)", owner.getId(),
                owner.getCompanyId(), owner.getFirsstName(), owner.getLastName());
    }

    @Override
    public void update(Owner owner) {
        jdbcTemplate.update("UPDATE Owner SET id = ?, companyId=?,firstName=? lastName WHERE id = ?", owner.getId(),
                owner.getFirsstName(), owner.getLastName());
    }
}
