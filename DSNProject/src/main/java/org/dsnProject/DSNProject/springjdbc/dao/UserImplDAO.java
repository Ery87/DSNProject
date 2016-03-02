package org.dsnProject.DSNProject.springjdbc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.dsnProject.DSNProject.encryption.AESencrp;
import org.dsnProject.DSNProject.jdbc.UserRowMapper;
import org.dsnProject.DSNProject.springjdbc.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.BufferedInputStream;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserImplDAO implements UserDao{
	
	@Autowired  
	 DataSource dataSource;  
	
	public void setDataSource(DataSource datasource){
		this.dataSource=datasource;
	}
	
	public List<User> getUserList() {  
		  List userList = new ArrayList();  
		  
		  String sql = "select * from user";  
		  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  userList = jdbcTemplate.query(sql, new UserRowMapper());  
		  return userList;  
		 }
 
	 public List<User> getFriends(String email) {  
	  List<User> userList = new ArrayList<User>();  
	  String sql = "select * from user as u join friend as f WHERE f.user= \"" + email+"\" AND f.friend_user=u.email;";  
	  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
	  userList = jdbcTemplate.query(sql, new UserRowMapper());  
	  return userList;  
	 }

	public boolean isPresent(String email){
		  List<User> userList = new ArrayList<User>();  
		String sql="SELECT * FROM user WHERE email= \""+email+"\";";
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		userList=jdbcTemplate.query(sql, new UserRowMapper());
		if(userList.size()==0) return false;
		else return true;
	}
	public void insertDao(User user) throws Exception {
		String pw,hash;
		String sql="INSERT INTO user (email,firstname,lastname,birth_day,city,photo,pw) VALUES (?,?,?,?,?,?,?);";
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		pw=user.getPw();
		
		hash=AESencrp.encrypt(pw);
		
		
		File fb=new File("resurces/images/photo_profile/"+ user.getPhoto()+"/");
		
		jdbcTemplate.update(
				sql,
				new Object[]{user.getEmail(),user.getFirstname(),user.getLastname(),user.getBirth_day(),user.getCity(),user.getPhoto(),hash});
	}  
	
	
	public List<User> login(String email,String pw) throws Exception{
		List<User> userList = new ArrayList<User>();  
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		String sql="SELECT * FROM user WHERE email=\""+email+"\";";
		userList=jdbcTemplate.query(sql, new UserRowMapper());
		
		String pwH=userList.get(0).getPw();
		String phHash=AESencrp.decrypt(pwH);
		
		if(phHash.equals(pw)) return userList;
		else return userList=null;
			
	}


}
