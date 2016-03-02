package org.dsnProject.DSNProject.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dsnProject.DSNProject.springjdbc.bean.Friend;
import org.springframework.jdbc.core.RowMapper;

public class FriendRowMapper implements RowMapper<Friend>{

	public Friend mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
