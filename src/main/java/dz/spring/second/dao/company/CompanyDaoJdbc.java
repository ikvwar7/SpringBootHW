package dz.spring.second.dao.company;

import dz.spring.second.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyDaoJdbc implements CompanyDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Company> getAll() {
        return jdbcTemplate.query("SELECT * FROM Company", new CompanyRowMapper());
    }

    @Override
    public Company getById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM Company WHERE id=?", new CompanyRowMapper(), id);
    }

    @Override
    public void insert(Company company) {
        jdbcTemplate.update("Insert into Company (id,title) VALUES (?,?)", company.getId(), company.getTitle());
    }

    @Override
    public void update(Company company) {
        jdbcTemplate.update("UPDATE Company SET id = ?, title=? WHERE id = ?", company.getId(), company.getTitle(), company.getId());
    }
}
