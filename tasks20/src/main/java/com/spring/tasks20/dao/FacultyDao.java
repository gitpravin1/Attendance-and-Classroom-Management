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
import com.spring.tasks20.entity.Faculty;

@Repository
public class FacultyDao {

	@Autowired
	SessionFactory factory;

	public List<Faculty> getAllFaculty() {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Faculty.class);
		List <Faculty> lc=criteria.list();
		transaction.commit();
		return lc;
	}

	public List<Faculty> getFacultyById(long id) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Faculty.class);
		criteria.add(Restrictions.eq("facultyId", id));
		List <Faculty> lc=criteria.list();
		transaction.commit();
		return lc;
	}

	public String createFaculty(Faculty c) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Faculty.class);
		session.save(c);
		transaction.commit();
		return "Faculty Inserted";
	}

	public String updateFaculty(long facultyId, String facultyName) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Faculty faculty =session.get(Faculty.class, facultyId);
		if (faculty != null) {
			faculty.setFacultyName(facultyName);
		}
		transaction.commit();
		return "Faculty Updated Sucessfully";
	}

	public String deleteFacultyById(long facultyId) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Faculty faculty =session.get(Faculty.class, facultyId);
		if (faculty != null) {
			session.delete(faculty);
		}
		transaction.commit();
		return "Faculty Deleted Sucessfully";
	}
	
	
	
	
	
	
}
