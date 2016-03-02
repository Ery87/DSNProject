package org.dsnProject.DSNProject.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dsnProject.DSNProject.springjdbc.bean.Album;
import org.springframework.jdbc.core.RowMapper;
public class AlbumRowMapper implements RowMapper<Album>{

	public Album mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlbumExtractor albumExtractor=new AlbumExtractor();
		return albumExtractor.extractData(rs);
	}

}
