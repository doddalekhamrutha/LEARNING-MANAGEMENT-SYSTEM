package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class scdao {
	@Autowired
   ScInterface repo;

	public void insert(StudentCourse sc) {
		// TODO Auto-generated method stub
		repo.save(sc);
	}

	public List<StudentCourse> retrieve() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
