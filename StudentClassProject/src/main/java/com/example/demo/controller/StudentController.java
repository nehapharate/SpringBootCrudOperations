package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentClassModel;
import com.example.demo.service.StudentClassService;
import com.example.demo.service.StudentService;


@RestController
public class StudentController {

	// @RequestMapp//(name = "/login",method = RequestMethod.GET)
	@Autowired
	StudentClassService service;

	@GetMapping("/login")
	public String loginPage() {
		System.out.println("This is login page");
		return "Welcome this is newpage";

	}

	@GetMapping("/student/welcome")
	public String welcomepage() {

		return "Welcome this is newpage";

	}

	// @RequestMapping(name = "/student/saveStudent", method = RequestMethod.POST)
	@PostMapping("/student/saveStudent/{id}/{div}/{branch}/{subject}")
	public void saveStudent(@PathVariable("id") String id, @PathVariable("div") String div,@PathVariable("branch") String branch ,@PathVariable("subject") String subject)
	{

		System.out.println("Id: " + id + "Division: " + div +"Branch: " + branch +"Subject: " + subject);
	}

	@PostMapping("/student/saveStudentClassModel")
	public void saveStudenModel(@RequestBody StudentClassModel studentModel) {
		// StudentServiceImpl service = new StudentServiceImpl();

		System.out.println("StudentClass Model: " + studentModel.getId() + " ," + studentModel.getDiv() + " ,"
				+ studentModel.getBranch() + " ," + studentModel.getSubject());
		
		service.savestudent(studentModel);
	}

	@GetMapping("/student/getAll")
	public List<StudentClassModel> getAllData() {
		List list = service.getAllStudent();
		System.out.println("Student List: " + list);
		return list;
	}
	
	@GetMapping("/student/findById/{id}")
	public StudentClassModel FindById(@PathVariable("id") Integer id) {
		StudentClassModel s= service.findById(id);
		System.out.println("Student List: " + s);
		return s;
	}
}

