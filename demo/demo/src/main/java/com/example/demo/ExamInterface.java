package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamInterface  extends JpaRepository<Exam, String>{

	Exam findByExamid(String examid);

}
