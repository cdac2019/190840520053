package com.JDBC.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public boolean creatuser() {
		String sql="insert into student (name,pwd,email,mobile) values (?,?,?,?)";
		jdbcTemplate.update(sql, "ROD","JONHSON","ROD@GMAIL.COM","123456");
		return true;
	}	
		
		public boolean updateuser() {
			String sql=" update student set pwd=? where rno=? ";
			jdbcTemplate.update(sql,  "JOHNSON",33);
			return true;
		
	}
		public boolean readuser() {
			String sql="select * from student where rno=1 ";
			 
		  List<Map<String,Object>> list =jdbcTemplate.queryForList(sql );
			System.out.println(list);
			
			return true;
		}
		
		
		public boolean readoneuser() {
			String sql="select * from student where rno=? ";
		User user=(User)jdbcTemplate.queryForObject(sql, new Object[] {33}, new RowMapper());
		System.out.println(user);
			return true;
		}
		
	
}
