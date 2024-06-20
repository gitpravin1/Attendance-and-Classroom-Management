package com.spring.tasks20.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tasks20.dao.FacultyDao;
import com.spring.tasks20.entity.Faculty;

@Service
public class FacultyService {

	@Autowired
	FacultyDao dao;
	
	
		public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return dao.getAllFaculty();
	   }

	public List<Faculty> getFacultyById(long id) {
		// TODO Auto-generated method stub
		return dao.getFacultyById(id);
	}

	public String createFaculty(Faculty c) {
		// TODO Auto-generated method stub
		return dao.createFaculty( c);
	}

	public String updateFaculty(long facultyId, String facultyName) {
		// TODO Auto-generated method stub
		return dao.updateFaculty(facultyId,facultyName);
	}

	public String deleteFacultyById(long facultyId) {
		// TODO Auto-generated method stub
		return dao.deleteFacultyById(facultyId);
	}

	
	
	
}
