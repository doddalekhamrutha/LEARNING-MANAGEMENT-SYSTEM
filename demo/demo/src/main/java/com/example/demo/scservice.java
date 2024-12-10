package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class scservice {
	@Autowired
scdao dao;
	@PostMapping("/addstudentcourse")
	public String add(@RequestBody StudentCourse sc) {
		dao.insert(sc);
		return "Added Successfully";
	}
	@GetMapping("/getstudentcourses")
	public List<StudentCourse> getAll(){
		return dao.retrieve();
	}
}
