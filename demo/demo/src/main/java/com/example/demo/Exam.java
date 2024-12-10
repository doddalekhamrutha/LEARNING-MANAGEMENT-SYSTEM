package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name= "exams")
public class Exam {
@Id
private String examid;
private String examcoursecode;
private String examtime;
private String examdate;
private String isactive;
public String getExamid() {
	return examid;
}
public void setExamid(String examid) {
	this.examid = examid;
}
public String getExamcoursecode() {
	return examcoursecode;
}
public void setExamcoursecode(String examcoursecode) {
	this.examcoursecode = examcoursecode;
}
public String getExamtime() {
	return examtime;
}
public void setExamtime(String examtime) {
	this.examtime = examtime;
}
public String getExamdate() {
	return examdate;
}
public void setExamdate(String examdate) {
	this.examdate = examdate;
}
public String getIsactive() {
	return isactive;
}
public void setIsactive(String isactive) {
	this.isactive = isactive;
}
@Override
public String toString() {
	return "Exam [examid=" + examid + ", examcoursecode=" + examcoursecode + ", examtime=" + examtime + ", examdate="
			+ examdate + ", isactive=" + isactive + "]";
}

}
