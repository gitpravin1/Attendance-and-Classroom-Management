package com.spring.tasks20.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.tasks20.entity.ClassSchedule;
import com.spring.tasks20.entity.Classroom;

@Repository
public class ClassDao {

	@Autowired
	SessionFactory factory;
	public List<ClassSchedule> getallClasses() {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(ClassSchedule.class);
		@SuppressWarnings("unchecked")
		List <ClassSchedule> lc=criteria.list();
		transaction.commit();
		return lc;
	}
	public List<ClassSchedule> getClassById(long id) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(ClassSchedule.class);
		criteria.add(Restrictions.eq("classScheduleId", id));
		List <ClassSchedule> lc=criteria.list();
		transaction.commit();
		return lc;
	}
	public String createClass(ClassSchedule c) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(ClassSchedule.class);
		session.save(c);
		transaction.commit();
		return "Classroom Inserted";
		
	}
	public String updateClass(long classId, String class_name) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		ClassSchedule classroom =session.get(ClassSchedule.class, classId);
		if (classroom != null) {
			classroom.setDayOfWeek(class_name);
		}
		transaction.commit();
		return "Class Updated Suucessfully";
	}
	public String deleteClassById(long classId) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		ClassSchedule classroom =session.get(ClassSchedule.class, classId);
		if (classroom != null) {
			session.delete(classroom);
		}
		transaction.commit();
		return "ClassRoom Deleted Sucessfully";
	}
	
	
	
	

}
