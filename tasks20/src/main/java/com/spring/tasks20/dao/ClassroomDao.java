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

@Repository
public class ClassroomDao {

	@Autowired
	SessionFactory factory ;
	public List<Classroom> getAllClassRooms() {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(Classroom.class);
		@SuppressWarnings("unchecked")
		List <Classroom> lc=criteria.list();
		transaction.commit();
		return lc;
		
		
	}
	public List<Classroom> getClassRoomById(long id) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(Classroom.class);
		criteria.add(Restrictions.eq("classroomId", id));
		List <Classroom> lc=criteria.list();
		transaction.commit();
		return lc;
	}
	public String createClassRoom(Classroom c) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(Classroom.class);
		session.save(c);
		transaction.commit();
		return "Classroom Inserted";
		
	}
	public String updateClassRoom(long classroomId ,String classroom_name) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Classroom classroom =session.get(Classroom.class, classroomId);
		if (classroom != null) {
			classroom.setClassroomName(classroom_name);
		}
		transaction.commit();
		return "ClassRoom Updated Sucessfully";
	}
	
	public String deleteClassroomById(long classroomid) {
		// TODO Auto-generated method stub
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Classroom classroom =session.get(Classroom.class, classroomid);
		if (classroom != null) {
			session.delete(classroom);
		}
		transaction.commit();
		return "ClassRoom Deleted Sucessfully";
	}

}
