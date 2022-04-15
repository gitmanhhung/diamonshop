package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperUsers {
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users users = new Users();
		users.setId(rs.getLong("id"));
		users.setUser(rs.getString("user"));
		users.setPassword(rs.getString("password"));
		users.setDisplay_name(rs.getString("display_name"));
		users.setAddress(rs.getString("address"));
		return users;
}
}