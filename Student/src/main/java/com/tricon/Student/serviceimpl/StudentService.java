package com.tricon.Student.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.Student.dao.IStudentDao;
import com.tricon.Student.model.Student;
import com.tricon.Student.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentDao studentDao; 
	
	
	@Override
	public List<Student> getBikeDetails() {
		
		return studentDao.getBikeDetails();
	}
	@Override
	public Student getBikeId(int id) {
		
		return studentDao.getBikeId(id);
	}
	@Override
	public String getBikeAdd(Student obj) {
		
		return studentDao.getBikeAdd(obj);
	}
	
	@Override
	public String getBikeDelete(int id) {
		
		return studentDao.getBikeDelete(id);
	}
	@Override
	public String getBikeUpdate(Student obj) {
		
		return studentDao.getBikeUpdate(obj);
	}

	

}
