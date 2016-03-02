package org.dsnProject.DSNProject.springjdbc.dao;

import java.util.List;

import org.dsnProject.DSNProject.springjdbc.bean.User;

public interface UserDao {
	    
	 public void insertDao(User user) throws Exception;   
	 public List<User> getUserList();  
	 public List<User> getFriends(String email); 
	public List<User> login(String email,String pw) throws Exception;
	public boolean isPresent(String email);
		
}
