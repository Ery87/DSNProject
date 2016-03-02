package org.dsnProject.DSNProject.springjdbc.bean;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;

public class User {
	private String firstname;
	private String lastname;
	private String email;
	private String pw;
	private String birth_day;
	private String city;
	private String photo;
	
	

	public User(String name_user,String surname,String email,String pw,String birth_day,String city,String image){
		
		this.firstname=name_user;
		this.lastname=surname;
		this.email=email;
		this.pw=pw;
		this.birth_day=birth_day;
		this.city=city;
		this.photo=image;
				
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public String getPhoto() throws SQLException {
		return photo;
	}

	public void setPhoto(String bs) {
		this.photo=bs;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String name_user) {
		this.firstname = name_user;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String surname) {
		this.lastname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
