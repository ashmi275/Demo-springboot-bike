package com.tricon.Student.service;

import java.util.List;

import com.tricon.Student.model.Student;

public interface IStudentService {
	public List<Student>  getBikeDetails();
	public Student getBikeId(int id);
	public String getBikeAdd(Student obj);
	public String getBikeUpdate(Student obj);
	public String getBikeDelete(int id);
	
}
