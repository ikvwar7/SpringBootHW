package dz.spring.second.dao.owner;

import dz.spring.second.domain.Owner;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OwnerRowMapper implements RowMapper<Owner> {
    @Override
    public Owner mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Long companyId = resultSet.getLong("companyId");
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        return new Owner(id, companyId, firstName, lastName);
    }
}
