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
import com.spring.tasks20.entity.Course;
import com.spring.tasks20.service.CourseService;

@RestController
@RequestMapping("api/course")
public class CourseController {
	@Autowired
	CourseService service;
	
	@GetMapping("/all_Course")
	public List<Course> getAllCourse() {
		return service.getAllCourse();
		};
		
	@GetMapping("/coursebyid/{id}")
	public List<Course> getCourseById(@PathVariable long id)
	{
		return service.getCourseById(id);	
	};
	
	@PostMapping("/createcourse")
	public String createCourse(@RequestBody Course c) {
		return service.createCourse(c);
	};
	
	@PutMapping("/updatecoursebyid/{courseId}/{course_name}")
	public String updateCourse(@PathVariable long courseId ,@PathVariable String course_name) {
		return service.updateCourse(courseId,course_name);
	}	
	@DeleteMapping("/deletecoursebyid/{courseid}")
	public String deleteCourseById(@PathVariable long courseid) {
		return service.deleteCourseById(courseid);
	}
	

}
