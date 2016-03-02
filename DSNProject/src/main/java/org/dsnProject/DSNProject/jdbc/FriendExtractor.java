package org.dsnProject.DSNProject.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dsnProject.DSNProject.springjdbc.bean.Friend;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FriendExtractor implements ResultSetExtractor<Friend>{

	public Friend extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
