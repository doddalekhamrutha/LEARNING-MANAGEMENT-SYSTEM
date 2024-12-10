package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface assignmentInterface extends JpaRepository<Assignment, Integer>{
public Assignment findByAssid(int assid);

}
