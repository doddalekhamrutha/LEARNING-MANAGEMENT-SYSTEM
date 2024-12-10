package com.example.demo;

import java.io.IOException;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class assignmentservice {

@Autowired
assignmentdao dao;
@PostMapping("/addassign")
public String addass(@RequestBody Assignment a) {
	System.out.println(facultyservice.getFacloggedin());
	a.setFacid(facultyservice.getFacloggedin());
	return dao.addAssign(a);
}
@GetMapping("/allassignments")
public List<Assignment> allass(){
	return dao.repo.findAll();
}
 

@PutMapping("/upload")
public  String uploadFile(
        @RequestParam("assid") int assid,
        @RequestParam("description") String description,
        @RequestParam("status") String status,
        @RequestParam("coursename") String coursename,
        @RequestParam("file_name") String file_name,
        @RequestPart("file") MultipartFile file) {

    // Retrieve the current assignment by ID
    Assignment cur = dao.repo.findByAssid(assid);

    if (cur == null) {
        return "Assignment not found";
    }

    // Update fields
    cur.setDes(description);
    cur.setStatus(status);
    cur.setCoursename(coursename);
    cur.setFileName(file_name);
  
    cur.setStudentid(userservice.getloggedin());

    try {

        cur.setFile(file.getBytes());
    } catch (IOException e) {
        return "Failed to upload file";
    }

    dao.repo.save(cur); // Save the updated assignment
    return "Uploaded";
}


}
