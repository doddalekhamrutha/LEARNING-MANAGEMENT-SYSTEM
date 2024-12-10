package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class examdao {
	@Autowired
    ExamInterface repo;
	public void insert(Exam exam) {
		// TODO Auto-generated method stub
		repo.save(exam);
	}

	

	public void delete(String examid) {
		// TODO Auto-generated method stub
		Exam u =repo.findByExamid(examid);
		repo.delete(u);
	}

	public void edit(Exam exam) {
		// TODO Auto-generated method stub
		repo.delete(repo.findByExamid(exam.getExamid()));
		repo.save(exam);
	}

	public List<Exam> retrieve() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
