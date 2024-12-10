package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
private String coursename;
@Id
private String coursecode;
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public String getCoursecode() {
	return coursecode;
}
@Override
public String toString() {
	return "Courses [coursename=" + coursename + ", coursecode=" + coursecode + "]";
}
public void setCoursecode(String coursecode) {
	this.coursecode = coursecode;
}

}