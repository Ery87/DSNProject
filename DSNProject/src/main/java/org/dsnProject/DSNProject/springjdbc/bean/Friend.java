package org.dsnProject.DSNProject.springjdbc.bean;

public class Friend {
	
	Integer id_friend;
	String user;
	String friend_user;
	
	public Friend(Integer id,String u,String f){
		this.id_friend=id;
		this.user=u;
		this.friend_user=f;
	}
	
	public Integer getId(){
		return id_friend;
	}
	
	public void setId(Integer id){
		this.id_friend=id;
	}
	
	
	public String getUser(){
		return user;
	}
	
	public void setUser(String u){
		this.user=u;
	}
	
	public String getFriend(){
		return friend_user;
	}
	
	public void setFriend(String f){
		this.friend_user=f;
	}
}
