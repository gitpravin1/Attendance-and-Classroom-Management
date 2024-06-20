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
import com.spring.tasks20.entity.Subject;
import com.spring.tasks20.service.SubjectService;

@RestController
@RequestMapping("api/subject")
public class SubjectController {
	
	@Autowired
	SubjectService service;
	
	@GetMapping("/all_subjects")
	public List<Subject> getAllSubjects() {
		return service.getAllSubjects();
		};
		
	@GetMapping("/subjectbyid/{id}")
	public List<Subject> getSubjectById(@PathVariable long id)
	{
		return service.getSubjectById(id);	
	};
	
	@PostMapping("/createsubject")
	public String createSubject(@RequestBody Subject s) {
		return service.createSubject(s);
	};
	@PutMapping("/updatesubjectbyid/{subjectId}/{subjectName}")
	public String updateSubject(@PathVariable long subjectId ,@PathVariable String subjectName) {
		return service.updateSubject(subjectId,subjectName);
	}	
	@DeleteMapping("/deletesubjectbyid/{subjectId}")
	public String deletesubjectById(@PathVariable long subjectId) {
		return service.deletesubjectById(subjectId);
	}
	
	

}
