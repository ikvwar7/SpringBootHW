package dz.spring.second.dao.companydao;

import dz.spring.second.domain.Company;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyRowMapper implements RowMapper<Company> {
    @Override
    public Company mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        String title = resultSet.getString("title");
        return new Company(id, title);
    }
}
