package org.dsnProject.DSNProject.controller;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.dsnProject.DSNProject.services.AlbumService;
import org.dsnProject.DSNProject.services.UserService;
import org.dsnProject.DSNProject.springjdbc.bean.Album;
import org.dsnProject.DSNProject.springjdbc.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller  
	public class MainController {  
	  
	 @Autowired  
	 UserService userService;  
	 AlbumService albumService;
	  
	 
  
	  
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView loginUser(@RequestParam("email") String email,@RequestParam("pw") String pw) throws Exception{
		/*OutputStream out= new ObjectOutputStream();*/
		Object error=null;
		List<User> u=userService.login(email, pw);
	
		if(!(u.isEmpty())){
			
			 List<User> userList = userService.getFriends(email);
			 List<String> friends=new ArrayList<String>();
			/*List<String> album=albumService.getAlbumList(email);*/
			 for (User var : userList) {
				 friends.add(var.getFirstname()+var.getLastname());
			}
			 
			List<Object> user=new ArrayList<Object>();
			user.add(u.get(0).getFirstname());
			user.add(u.get(0).getLastname());
			user.add(u.get(0).getBirth_day());
			user.add(u.get(0).getCity());
			user.add(u.get(0).getPhoto());
			Map<String,List> map=new HashMap<String,List>();
			map.put("friend", friends);
			map.put("profile", user);
	/*	map.put("album", album);*/
			  return new ModelAndView("profile", "map", map);  
		}
		else return new ModelAndView("/403","Not found",error);	
	}
	@RequestMapping("/profile")
	   public String profileUser(Model model) {  
	       return "profile";
	   }
	
	 @RequestMapping("/home")
	   public String welcomePage(Model model) {  
		/* String message=null;
		 return new ModelAndView("home", "", message);*/
		 return "home";
		 
	   }

	 @RequestMapping(value="/insert",method=RequestMethod.POST)
	 public ModelAndView inserData(@RequestParam("email") String email,@RequestParam("name_user") String name,@RequestParam("surname") String surname,@RequestParam("birth_day") String bd,@RequestParam("city") String city,@RequestParam("pw") String pw,@RequestParam("Cpw") String cpw,@RequestParam("photo") String photo) throws Exception{
	String message = null;
	if( !(email.isEmpty()) && !(name.isEmpty()) && !(surname.isEmpty()) && !(bd.isEmpty()) && !(city.isEmpty()) && !(pw.isEmpty()) && !(cpw.isEmpty()) && (pw.equals(cpw)) && !(photo.isEmpty())){ 
		User user=new User(name,surname,email,pw,bd,city,photo);
		if(!(userService.isPresent(email))){
			userService.inserData(user);
			 return new ModelAndView("home", "Registred completed", message);  
		}else return new ModelAndView("/403","Not found",message);
	 
		 }else return new ModelAndView("/403","Not found",message);
			
		 }
	 
	 @RequestMapping("/403")
	   public String PageError(Model model) {  
	       return "403";
	   }
	  
}