package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentClassModel;

@Repository
public interface StudentClassRepo extends JpaRepository<StudentClassModel, Integer> {

	
}
