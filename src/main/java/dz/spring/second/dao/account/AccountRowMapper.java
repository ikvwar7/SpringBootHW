package dz.spring.second.dao.accountdao;

import dz.spring.second.domain.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Long ownerId = resultSet.getLong("ownerId");
        String name = resultSet.getString("name");
        Double rate = resultSet.getDouble("rate");
        return new Account(id, name, ownerId, rate);
    }
}
