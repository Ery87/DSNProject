package org.dsnProject.DSNProject.services;

import java.util.List;

import org.dsnProject.DSNProject.springjdbc.bean.Album;

public interface AlbumService {

	public List<String> getAlbumList(String user);
}
