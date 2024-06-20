package com.spring.tasks20.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tasks20.entity.Department;
import com.spring.tasks20.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@GetMapping("/alldepartment")
	public List<Department> getAllDepartment() {
		return service.getAllDepartment();
		};
		
	@GetMapping("/departmentbyid/{id}")
	public List<Department> getDepartmentById(@PathVariable long id)
	{
		return service.getDepartmentById(id);	
	};
	
	@PostMapping("/createdepartment")
	public String createDepartment(@RequestBody Department c) {
		return service.createDepartment(c);
	};
	@PutMapping("/updatedepartmentbyid/{departmentId}/{departmentName}")
	public String updateDepartment(@PathVariable long departmentId ,@PathVariable String departmentName) {
		return service.updateDepartment(departmentId,departmentName);
	}	
	@DeleteMapping("/deletedepartmentbyid/{departmentId}")
	public String deleteDepartmentById(@PathVariable long departmentId) {
		return service.deleteDepartmentById(departmentId);
	}
	
	
	
	
}
