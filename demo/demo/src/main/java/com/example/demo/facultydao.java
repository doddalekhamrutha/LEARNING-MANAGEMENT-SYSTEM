package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class facultydao {
	@Autowired
facultyinterface repo;

	public void insertfac(faculty fac) {
		// TODO Auto-generated method stub
		repo.save(fac);
	}

	public faculty findfac(int facultyid) {
		// TODO Auto-generated method stub
		return repo.findByFacultyid(facultyid);
	}

}
