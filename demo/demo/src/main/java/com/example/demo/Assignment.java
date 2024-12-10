package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "assignmentdb1")
public class Assignment {

    @Id
    @GeneratedValue
    private int assid;
    private String studentid;
    private int facid;
    public int getFacid() {
		return facid;
	}

	public void setFacid(int facid) {
		this.facid = facid;
	}

	public String getStudentid() {
	return studentid;
}

public void setStudentid(String studentid) {
	this.studentid = studentid;
}

	private String startdate;
    private String enddate;
    private String status;
    private String des;
    private String coursename;
     

    @Lob
    private byte[] file; // To store file content as a blob in the database

    private String fileName; // To store the name of the uploaded file

    // Getters and Setters
    public int getAssid() {
        return assid;
    }

    public void setAssid(int assid) {
        this.assid = assid;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCoursename() {
        return coursename;
    }

   
	public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
} 