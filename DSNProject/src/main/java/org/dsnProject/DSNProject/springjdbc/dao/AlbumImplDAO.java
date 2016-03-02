package org.dsnProject.DSNProject.springjdbc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.dsnProject.DSNProject.jdbc.AlbumRowMapper;
import org.dsnProject.DSNProject.springjdbc.bean.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class AlbumImplDAO  implements AlbumDao{

	@Autowired  
	 DataSource dataSource;
	
	public List<String> getAlbumlist(String user) {
		List albumList=new ArrayList();
		String sql="select metatag from album where id_user=\""+user+"\";";
		JdbcTemplate jdbc=new JdbcTemplate(dataSource);
		albumList=jdbc.query(sql, new AlbumRowMapper());
		return albumList ;
	}

}
