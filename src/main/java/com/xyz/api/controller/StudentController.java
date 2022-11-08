package com.xyz.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.api.model.Student;
import com.xyz.api.repo.StudentRepository;

@RestController
@RequestMapping("/api/v1/student")


public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student ) {
		System.out.println("Input request ==" +student);
		repo.save(student);
		return"succesfully completed for studentid"+student;
	}

	// get all student details
		@GetMapping("/all")
		
		public List<Student> getAllstudent() {
			System.out.println("inside student details");
			List<Student> findAll = repo.findAll();
			return findAll;
			
	
	   }
}

