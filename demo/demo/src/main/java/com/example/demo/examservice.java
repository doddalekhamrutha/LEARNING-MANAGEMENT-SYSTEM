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
public class examservice {
	@Autowired
   examdao dao ;
	@PostMapping("/addexam")
	 public String add(@RequestBody Exam exam) {
		 dao.insert(exam);
		 return "Inserted Successfully";
	 }
	@GetMapping("/allexams")
	  public List<Exam> get(){
		  return dao.retrieve();
		  
	  }
	
	   @DeleteMapping("/deleteexam")
	   public String delete(@RequestParam("examid")String examid) {
		   dao.delete(examid);
		   return "Deleted Successfully";
	   }
	   @PutMapping("/updateexam")
	   public String edit(@RequestBody Exam exam) {
		   dao.edit(exam);
		   return "Edited Successfully";
	   }
}
