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
import com.spring.tasks20.entity.Subject;

@Repository
public class SubjectDao {

	@Autowired
	SessionFactory factory;

	public List<Subject> getAllSubjects() {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Subject.class);
		List <Subject> lc=criteria.list();
		transaction.commit();
		return lc;
	}

	public List<Subject> getSubjectById(long id) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Subject.class);
		criteria.add(Restrictions.eq("subjectId", id));
		List <Subject> lc=criteria.list();
		transaction.commit();
		return lc;
	}

	public String createSubject(Subject s) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Subject.class);
		session.save(s);
		transaction.commit();
		return "Subject Inserted";
	}

	public String updateSubject(long subjectId, String subjectName) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Subject subject =session.get(Subject.class, subjectId);
		if (subject != null) {
			subject.setSubjectName(subjectName);
		}
		transaction.commit();
		return "Subject Updated Sucessfully";
	}

	public String deletesubjectById(long subjectId) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Subject subject =session.get(Subject.class, subjectId);
		if (subject != null) {
			session.delete(subject);
		}
		transaction.commit();
		return "subject Deleted Sucessfully";
	}
	
}
