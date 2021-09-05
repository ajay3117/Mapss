package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="/student")
public class Studentcontroller{
	@Autowired
	private Studentrepository Studentrepository;
	@GetMapping("/Studentdetails")
	 public void insertStudent() {
		Studentdetails c=new Studentdetails(11, "cbit", "cbit@gmail.com");
	Studentrepository.save(c);
	}
	@GetMapping("/getStudentdetails")
	 public List<Studentdetails> getStudent() {
		 List<Studentdetails> st=Studentrepository.findAll();
		return st;
		
	}
}
