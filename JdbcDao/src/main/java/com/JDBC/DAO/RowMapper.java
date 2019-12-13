package com.JDBC.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user= new User();
		user.setRno(rs.getInt("rno"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setMobile(rs.getString("mobile"));
		return user;
	}

}
