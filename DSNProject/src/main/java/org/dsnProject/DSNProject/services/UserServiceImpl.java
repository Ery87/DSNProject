package org.dsnProject.DSNProject.services;

import java.util.List;

import org.dsnProject.DSNProject.springjdbc.bean.User;
import org.dsnProject.DSNProject.springjdbc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

	@Autowired  
	 UserDao userdao;  
	
	
	 public List<User> getFriends(String email) {
		return userdao.getFriends(email);
	}


	 
	 public List<User> getUserList() {  
	  return userdao.getUserList();  
	 }



	public void inserData(User user) throws Exception {
		userdao.insertDao(user);
	}

	public boolean isPresent(String email){
		return userdao.isPresent(email);
	}

	public List<User> login(String email,String pw) throws Exception {
		return userdao.login(email, pw);
	}

	


}
