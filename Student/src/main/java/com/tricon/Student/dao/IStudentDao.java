package com.tricon.Student.dao;

import java.util.List;

import com.tricon.Student.model.Student;

public interface IStudentDao {
	public List<Student> getBikeDetails();
	public Student getBikeId(int id);
	public String getBikeAdd(Student obj);
	public String getBikeUpdate(Student Obj);
	public String getBikeDelete(int id);
	
}
