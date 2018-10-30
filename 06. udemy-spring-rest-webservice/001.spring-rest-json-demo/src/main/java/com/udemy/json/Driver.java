package com.udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.udemy.json.pojo.StudentFull;
import com.udemy.json.pojo.StudentLite;

public class Driver {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		StudentLite studentLite = null;
		StudentFull studentFull = null;
		try {
			studentLite = mapper.readValue(new File("json-data/sample-lite.json"), StudentLite.class);
			studentFull = mapper.readValue(new File("json-data/sample-full.json"), StudentFull.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Student lite : " + studentLite);
		System.out.println("Student full : " + studentFull);
	}

}
