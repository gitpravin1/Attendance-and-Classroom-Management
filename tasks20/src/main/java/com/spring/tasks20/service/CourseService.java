package com.spring.tasks20.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tasks20.dao.CourseDao;
import com.spring.tasks20.entity.Course;

@Service
public class CourseService {
	
	@Autowired
   CourseDao dao;
	
	
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return dao.getAllCourse();
	}


	public List<Course> getCourseById(long id) {
		// TODO Auto-generated method stub
		return dao.getCourseById( id);
	}


	public String createCourse(Course c) {
		// TODO Auto-generated method stub
		return dao.createCourse(c);
	}


	public String updateCourse(long courseId, String course_name) {
		// TODO Auto-generated method stub
		return dao.updateCourse( courseId,  course_name);
	}


	public String deleteCourseById(long courseid) {
		// TODO Auto-generated method stub
		return dao.deleteCourseById( courseid);
	}


	


	
	
	

}
