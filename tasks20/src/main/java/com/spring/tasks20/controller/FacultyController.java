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

import com.spring.tasks20.entity.Classroom;
import com.spring.tasks20.entity.Faculty;
import com.spring.tasks20.service.FacultyService;

@RestController
@RequestMapping("api/faculty")
public class FacultyController {
	
	@Autowired
	FacultyService service;
	
	@GetMapping("/all_faculty")
	public List<Faculty> getAllFaculty() {
		return service.getAllFaculty();
		};
		
	@GetMapping("/facultybyid/{id}")
	public List<Faculty> getFacultyById(@PathVariable long id)
	{
		return service.getFacultyById(id);	
	};
	
	@PostMapping("/createfaculty")
	public String createFaculty(@RequestBody Faculty c) {
		return service.createFaculty(c);
	};
	@PutMapping("/updatefacultybyid/{facultyId}/{facultyName}")
	public String updateFaculty(@PathVariable long facultyId ,@PathVariable String facultyName) {
		return service.updateFaculty(facultyId,facultyName);
	}	
	@DeleteMapping("/deletefacultybyid/{facultyId}")
	public String deleteFacultyById(@PathVariable long facultyId) {
		return service.deleteFacultyById(facultyId);
	}

	
}
