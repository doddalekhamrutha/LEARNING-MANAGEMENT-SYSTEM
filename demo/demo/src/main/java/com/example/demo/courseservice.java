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
public class courseservice {
	@Autowired
coursedao dao;
	@PostMapping("/addcourse")
	public String addcourse(@RequestBody Courses c) {
		dao.add(c);
		return "course added";
	}
	@GetMapping("/allcourses")
	public List<Courses> getallcourses() {
       return dao.get();
		
	}
	@DeleteMapping("/deleteCourse")
	public String deletecourse(@RequestParam("coursecode") String coursecode) {
		dao.delete(coursecode);
		return "deleted successfully";
	}
	@PutMapping("/updateCourse")
	public String editcourse(@RequestBody Courses c) {
		dao.edit(c);
		return "edited successfully";
	}
	
	@GetMapping("/findcourse")
	public Courses getcourseyid(@RequestParam("coursecode") String coursecode) {
		return dao.findByCoursecode(coursecode);
	}
}