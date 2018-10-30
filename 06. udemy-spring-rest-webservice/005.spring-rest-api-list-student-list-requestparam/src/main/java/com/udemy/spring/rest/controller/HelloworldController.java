package com.udemy.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.spring.rest.pojo.Student;

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
		Student std = stdList.get(Integer.valueOf(id));
		return std;
	}
}
