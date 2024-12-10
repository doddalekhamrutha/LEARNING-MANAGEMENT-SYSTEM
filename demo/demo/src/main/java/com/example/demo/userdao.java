package com.example.demo;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userdao {
	@Autowired
UserInterface repo;

	public void insert(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	public User finduser(String username) {
		// TODO Auto-generated method stub
	return	repo.findByUsername(username);
		
	}

	public List<User> allstu() {
		// TODO Auto-generated method stub
		List<User> l=repo.findAll();
		List<User> p=new ArrayList<>();
		for(User i:l) {
			if(i.getUsername().length()==10) {
				p.add(i);
			}
		}
		return p;
	}
	public List<User> allpro() {
		// TODO Auto-generated method stub
	   List<User> l=repo.findAll();
	   List<User> p=new ArrayList<>();
	   for(User i: l) {
		   if(i.getUsername().length()==4) {
			   p.add(i);
		   }
	   }
	   return p;
	}

	public void delete(String username) {
		// TODO Auto-generated method stub
		User u =repo.findByUsername(username);
		repo.delete(u);
	}

	public void edit(User user) {
		// TODO Auto-generated method stub
		repo.delete(repo.findByUsername(user.getUsername()));
		repo.save(user);
	}
	
}