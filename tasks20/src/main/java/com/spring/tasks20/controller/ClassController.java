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

import com.spring.tasks20.entity.ClassSchedule;
import com.spring.tasks20.entity.Classroom;
import com.spring.tasks20.service.ClassService;

@RestController
@RequestMapping("/api/classchedule")
public class ClassController {
  
	@Autowired
	ClassService service;
	
	@GetMapping("/getallclassSchedules")
	public List<ClassSchedule> getallClasses()
	{
		return service.getallClasses();
	}
	
	@GetMapping("/classbyid/{id}")
	public List<ClassSchedule> getClassById(@PathVariable long id)
	{
		return service.getClassById(id);	
	};
	
	@PostMapping("/createclass")
	public String createClass(@RequestBody ClassSchedule c) {
		return service.createClass(c);
	};
	
	@PutMapping("/updateclassbyid/{classId}/{class_name}")
	public String updateClass(@PathVariable long classId ,@PathVariable String class_name) {
		return service.updateClass(classId,class_name);
	}
	
	@DeleteMapping("/deleteclassbyid/{classId}")
	public String deleteClassById(@PathVariable long classId) {
		return service.deleteClassById(classId);
	}
	
	
	
}
