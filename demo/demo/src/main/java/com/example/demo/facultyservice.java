package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class facultyservice {
public static int loggedinfac;
@Autowired
facultydao dao;
@PostMapping("/signupfac")
public String signupfac(@RequestBody faculty fac) {
	   dao.insertfac(fac);
	   return "Signup Successfull";
}
@GetMapping("/signinfac")
public String signinfac(@RequestParam("facultyid") int  facultyid,@RequestParam("facpass") String facpass) {
	   faculty u = dao.findfac(facultyid);
	   if(u == null) {
		   return "no";
	   }
	   else {
		   if(u.getFacpass().equals(facpass)) {
			   loggedinfac = facultyid;
			 return "faculty";
			   }
			 
		   
		   else {
			   return "no";
		   }
		   
	   }
	   
}
public static int getFacloggedin() {
	return loggedinfac;
}
@GetMapping("/facultyhome")
public ResponseEntity<Map<String, String>> loggedInFaculty() {
    // Assume loggedinfac is the faculty ID
     // Example faculty ID
    Map<String, String> response = new HashMap<>();
    response.put("facultyId", Integer.toString(loggedinfac)); // Convert to String and include in JSON response
    return ResponseEntity.ok(response); // Return JSON response
}
}
