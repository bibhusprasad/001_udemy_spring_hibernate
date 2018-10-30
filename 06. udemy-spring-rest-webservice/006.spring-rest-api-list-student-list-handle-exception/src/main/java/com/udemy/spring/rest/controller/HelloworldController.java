package com.udemy.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.spring.rest.exception.StudentNotFoundException;
import com.udemy.spring.rest.pojo.Student;
import com.udemy.spring.rest.pojo.StudentErrorResponse;

@RestController
@RequestMapping("/api")
public class HelloworldController {
	
	public static List<Student> stdList = null;
	
	static {
		stdList = new ArrayList<>();
		Student std1 = new Student("bibhu", "samal");
		Student std2 = new Student("alok", "dash");
		Student std3 = new Student("asutosh", "panda");
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
	}
	
	
	
	@GetMapping("/students")
	public List<Student> getResult() {
		return stdList;
	}
	
	@GetMapping("/students/std")
	public Student getStudent(@RequestParam String id) {
		int stdId = Integer.valueOf(id);
		if(stdId >= stdList.size() || stdId < 0) {
			throw new StudentNotFoundException("Student Id not found : "+ id);
		}
		return stdList.get(Integer.valueOf(id));
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exp){
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setMessage(exp.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleAllException(Exception exp){
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(exp.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}
}
