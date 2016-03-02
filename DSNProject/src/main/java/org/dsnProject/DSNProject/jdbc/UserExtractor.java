package org.dsnProject.DSNProject.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dsnProject.DSNProject.springjdbc.bean.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserExtractor implements ResultSetExtractor<User> {

	public User extractData(ResultSet resultSet) throws SQLException,  
	   DataAccessException  {
		
		    
			  User user = new User();  
			    
			 
			  user.setLastname(resultSet.getString(3));  
			  user.setFirstname(resultSet.getString(2));  
			  user.setEmail(resultSet.getString(1));  
			  user.setPw(resultSet.getString(7));  
			  user.setBirth_day(resultSet.getString(4));
			  user.setCity(resultSet.getString(5));
			  user.setPhoto(resultSet.getString(6));
			  return user; 
		
	}

}
