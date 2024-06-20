package com.spring.tasks20.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.tasks20.entity.Classroom;
import com.spring.tasks20.entity.Course;
@Repository
public class CourseDao {

	 @Autowired
	 SessionFactory factory;
	public List<Course> getAllCourse() {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(Course.class);
		@SuppressWarnings("unchecked")
		List <Course> lc=criteria.list();
		transaction.commit();
		return lc;
		
	}

	public List<Course> getCourseById(long id) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(Course.class);
		criteria.add(Restrictions.eq("courseId", id));
		List <Course> lc=criteria.list();
		transaction.commit();
		return lc;
	}

	public String createCourse(Course c) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(Course.class);
		session.save(c);
		transaction.commit();
		return "Course Inserted";
	}

	public String updateCourse(long courseId, String course_name) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Course classroom =session.get(Course.class, courseId);
		if (classroom != null) {
			classroom.setCourseName(course_name);
		}
		transaction.commit();
		return "Course Updated Suucessfully";
	}

	public String deleteCourseById(long courseid) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Course classroom =session.get(Course.class, courseid);
		if (classroom != null) {
			session.delete(classroom);
		}
		transaction.commit();
		return "ClassRoom Deleted Sucessfully";
	}

	

}
