package com.spring.tasks20.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tasks20.dao.SubjectDao;
import com.spring.tasks20.entity.Subject;

@Service
public class SubjectService {

	@Autowired
	SubjectDao dao;

	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return dao.getAllSubjects();
	}

	public List<Subject> getSubjectById(long id) {
		// TODO Auto-generated method stub
		return dao.getSubjectById(id);
	}

	public String createSubject(Subject s) {
		// TODO Auto-generated method stub
		return dao.createSubject(s);
	}

	public String updateSubject(long subjectId, String subjectName) {
		// TODO Auto-generated method stub
		return dao.updateSubject(subjectId,subjectName);
	}

	public String deletesubjectById(long subjectId) {
		// TODO Auto-generated method stub
		return dao.deletesubjectById(subjectId);
	}
	
}
