package com.spring.tasks20.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tasks20.dao.ClassDao;
import com.spring.tasks20.entity.ClassSchedule;
import com.spring.tasks20.entity.Classroom;

@Service
public class ClassService {

	@Autowired
	ClassDao dao;
	public List<ClassSchedule> getallClasses() {
		// TODO Auto-generated method stub
		return dao.getallClasses();
		}
	
	public List<ClassSchedule> getClassById(long id) {
		// TODO Auto-generated method stub
		return dao.getClassById(id);
	}

	public String createClass(ClassSchedule c) {
		// TODO Auto-generated method stub
		return dao.createClass(c);
	}

	public String updateClass(long classId, String class_name) {
		// TODO Auto-generated method stub
		return dao.updateClass( classId,  class_name);
	}

	public String deleteClassById(long classId) {
		// TODO Auto-generated method stub
		return dao.deleteClassById(classId);
	}
	

}
