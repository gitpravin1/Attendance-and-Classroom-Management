package com.spring.tasks20.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.tasks20.entity.Department;

@Repository
public class DepartmentDao {

	@Autowired
	SessionFactory factory;
	
	public List<Department> getAllDepartment() {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Department.class);
		List <Department> lc=criteria.list();
		transaction.commit();
		return lc;
	}

	public List<Department> getDepartmentById(long id) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Department.class);
		criteria.add(Restrictions.eq("departmentId", id));
		List <Department> lc=criteria.list();
		transaction.commit();
		return lc;
	}

	public String createDepartment(Department c) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria= session.createCriteria(Department.class);
		session.save(c);
		transaction.commit();
		return "Department Inserted";
	}

	public String updateDepartment(long departmentId, String departmentName) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Department department =session.get(Department.class, departmentId);
		if (department != null) {
			department.setDepartmentName(departmentName);
		}
		transaction.commit();
		return "Department Updated Sucessfully";
	}

	public String deleteDepartmentById(long departmentId) {
		Session session= factory.openSession();
		Transaction transaction =session.beginTransaction();
		Department department =session.get(Department.class, departmentId);
		if (department != null) {
			session.delete(department);
		}
		transaction.commit();
		return "Department Deleted Sucessfully";
	}
	
	

}
