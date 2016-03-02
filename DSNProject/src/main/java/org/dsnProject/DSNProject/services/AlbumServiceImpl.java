package org.dsnProject.DSNProject.services;

import java.util.List;

import org.dsnProject.DSNProject.springjdbc.bean.Album;
import org.dsnProject.DSNProject.springjdbc.dao.AlbumDao;
import org.springframework.beans.factory.annotation.Autowired;

public class AlbumServiceImpl implements AlbumService {
	
	@Autowired  
	AlbumDao albumdao;  

	
	public List<String> getAlbumList(String user) {
		return albumdao.getAlbumlist(user);
	}
}
