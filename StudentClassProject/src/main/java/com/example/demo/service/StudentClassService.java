package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentClassModel;
import com.example.demo.repo.StudentClassRepo;
import com.example.demo.service.StudentClassService;

@Service
public class StudentClassService implements StudentService{

	@Autowired
	StudentClassRepo repo;
	
	public void savestudent(StudentClassModel student) {

		repo.save(student);
		
	}

	public List getAllStudent() {
		return repo.findAll();
		
	}

	public StudentClassModel findById(Integer id) {
		
		return repo.findById(id).get();
	}
}

