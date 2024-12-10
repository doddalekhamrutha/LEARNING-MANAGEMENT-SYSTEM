package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface facultyinterface extends JpaRepository<faculty,Integer>{
public faculty findByFacultyid(int facultyid);
}
