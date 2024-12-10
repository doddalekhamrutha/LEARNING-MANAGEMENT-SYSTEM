package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="studentcoursey")
public class StudentCourse {
	@Id
	@GeneratedValue
	private int id;
private String susername;
private String coursecode;
private String fusername;
public String getFusername() {
	return fusername;
}
public void setFusername(String fusername) {
	this.fusername = fusername;
}
public String getSusername() {
	return susername;
}
public void setSusername(String susername) {
	this.susername = susername;
}
public String getCoursecode() {
	return coursecode;
}
public void setCoursecode(String coursecode) {
	this.coursecode = coursecode;
}
@Override
public String toString() {
	return "StudentCourse [susername=" + susername + ", coursecode=" + coursecode + "]";
}

}
