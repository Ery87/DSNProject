package org.dsnProject.DSNProject.springjdbc.dao;

import java.util.List;

import org.dsnProject.DSNProject.springjdbc.bean.Album;

public interface AlbumDao {

	List<String> getAlbumlist(String user);

}
