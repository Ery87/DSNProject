package org.dsnProject.DSNProject.springjdbc.dao;

import java.util.List;

import org.dsnProject.DSNProject.springjdbc.bean.Friend;
import org.dsnProject.DSNProject.springjdbc.bean.User;

public interface FriendDao {
	
	public void insertFriend(Friend friend);   
	 public List<Friend> getFriendList();  
	
}
