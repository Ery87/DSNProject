package org.dsnProject.DSNProject.services;

import java.util.List;  
import org.dsnProject.DSNProject.springjdbc.bean.User;

public interface UserService {  
	  
	 
	 public List<User> getFriends(String email);
	public List<User> getUserList();

	public void inserData(User user) throws Exception;  
	public List<User> login(String email,String pw) throws Exception;
	public boolean isPresent(String email);
}
