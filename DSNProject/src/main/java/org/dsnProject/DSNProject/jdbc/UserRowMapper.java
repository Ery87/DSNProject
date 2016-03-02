package org.dsnProject.DSNProject.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import org.dsnProject.DSNProject.springjdbc.bean.User; 

public class UserRowMapper  implements RowMapper<User> {  
	  
 
	 public User mapRow(ResultSet resultSet, int line) throws SQLException {  
	  UserExtractor userExtractor = new UserExtractor();  
	  return userExtractor.extractData(resultSet);  
	 }  
	  
	}  