package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="faculty")
public class faculty {
	@Id
int facultyid;
String facpass;
String Desig;
String Branch;
String course;
public int getFacultyid() {
	return facultyid;
}
public void setFacultyid(int facultyid) {
	this.facultyid = facultyid;
}
public String getFacpass() {
	return facpass;
}
public void setFacpass(String facpass) {
	this.facpass = facpass;
}
public String getDesig() {
	return Desig;
}
public void setDesig(String desig) {
	Desig = desig;
}
public String getBranch() {
	return Branch;
}
public void setBranch(String branch) {
	Branch = branch;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "faculty [facultyid=" + facultyid + ", facpass=" + facpass + ", Desig=" + Desig + ", Branch=" + Branch
			+ ", course=" + course + "]";
}


}
