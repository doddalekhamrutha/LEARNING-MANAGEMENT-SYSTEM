package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class coursedao {
	@Autowired
	CourseInterface repo;

	public void add(Courses c) {
		// TODO Auto-generated method stub
		repo.save(c);
	}

	public List<Courses> get() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void delete(String coursecode) {
		// TODO Auto-generated method stub
		Courses c=repo.findByCoursecode(coursecode);
		repo.delete(c);
	}

	public void edit(Courses c) {
		// TODO Auto-generated method stub
	  delete(c.getCoursecode());
		repo.save(c);
	}

	public Courses findByCoursecode(String coursecode) {
		// TODO Auto-generated method stub
		return repo.findByCoursecode(coursecode);
	}
}