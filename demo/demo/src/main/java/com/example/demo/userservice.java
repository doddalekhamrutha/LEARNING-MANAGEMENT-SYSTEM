package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class userservice {
	public static  String loggedin;
   @Autowired
   userdao dao;
   @PostMapping("/signup")
   public String signup(@RequestBody User user) {
	   dao.insert(user);
	   return "Signup Successfull";
   }
   @GetMapping("/signin")
   public String signin(@RequestParam("username") String username,@RequestParam("password") String password) {
	   User u = dao.finduser(username);
	   if(u == null) {
		   return "no";
	   }
	   else {
		   if(u.getPassword().equals(password)) {
			   if(username.equals("admin")&&password.equals("admin")) {
				   loggedin=username;
				   return "admin";
				   
			   }
			   else {
				   loggedin=username;
				   return "user";
			   }
			   
		   }
		   else {
			   return "no";
		   }
		   
	   }
	   
   }
   @GetMapping("/allstu")
   public List<User> getStudents() {
	  List<User> p= dao.allstu();
	  System.out.println(p);
	  return p;
   }
   @GetMapping("/allpro")
   public List<User> getProfessors() {
	 return  dao.allpro();
	 
	   
   }
   @DeleteMapping("/delete")
   public String deleteUser(@RequestParam("username")String username) {
	   dao.delete(username);
	   return "Deleted Successfully";
   }
   @PutMapping("/update")
   public String editUser(@RequestBody User user) {
	   dao.edit(user);
	   return "Edited Successfully";
   }
public static String getloggedin() {
	 
	return loggedin;
}
}