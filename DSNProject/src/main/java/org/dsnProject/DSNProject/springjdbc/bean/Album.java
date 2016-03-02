package org.dsnProject.DSNProject.springjdbc.bean;

public class Album {

	String id_album;
	String metatag;
	String url;
	
	
	public Album(String id,String m,String url){
		this.id_album=id;
		this.metatag=m;
		this.url=url;
	}
	
	public void setId(String id){
		this.id_album=id;
	}
	
	public String getId(){
		return id_album;
	}
	
	public void setMetatag(String m){
		this.metatag=m;
	}
	
	public String getMetatag(){
		return metatag;
	}
	public void setUrl(String u){
		this.url=url;
	}
	
	public String getUrl(){
		return url;
	}
	
}
