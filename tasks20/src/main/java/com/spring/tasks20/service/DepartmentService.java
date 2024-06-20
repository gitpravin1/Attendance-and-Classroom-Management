package com.spring.tasks20.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tasks20.dao.DepartmentDao;
import com.spring.tasks20.entity.Department;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDao dao;

	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return dao.getAllDepartment();
	}

	public List<Department> getDepartmentById(long id) {
		// TODO Auto-generated method stub
		return dao.getDepartmentById(id);
	}

	public String createDepartment(Department c) {
		// TODO Auto-generated method stub
		return dao.createDepartment(c);
	}

	public String updateDepartment(long departmentId, String departmentName) {
		// TODO Auto-generated method stub
		return dao.updateDepartment( departmentId,  departmentName);
	}

	public String deleteDepartmentById(long departmentId) {
		// TODO Auto-generated method stub
		return dao.deleteDepartmentById( departmentId);
	}

}
