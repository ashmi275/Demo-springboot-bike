package com.tricon.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.Student.model.Student;
import com.tricon.Student.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	private IStudentService  student;
	
	@RequestMapping(value="/bikedetails", method=RequestMethod.GET)
	public List<Student> getbikedetails() {
		System.out.println("Inside: Controller");
		return student.getBikeDetails();
	}
	
	@RequestMapping(value="/bikedetails/{id}", method=RequestMethod.GET)
	public Student getBikeId(@PathVariable int id) {
		System.out.println("Inside: Controller");
		return student.getBikeId(id);
	}
	
	@RequestMapping(value="/bikedetails", method=RequestMethod.POST)
	public String getBikeAdd(@RequestBody Student obj) {
		System.out.println("Inside: Controller");
		return student.getBikeAdd(obj);
	}
	
	@RequestMapping(value="/bikedetails", method=RequestMethod.PUT)
	public String getBikeUpdate(@RequestBody Student obj) {
		System.out.println("Inside: Controller");
		return student.getBikeUpdate(obj);
	}
	
	@RequestMapping(value="/bikedetails/{id}", method=RequestMethod.DELETE)
	public String getBikeDelete(@PathVariable int id) {
		System.out.println("Inside: Controller");
		return student.getBikeDelete(id);
	}
}
