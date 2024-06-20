package com.spring.tasks20.controller;

import java.util.List;

import javax.annotation.PostConstruct;

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
import com.spring.tasks20.service.ClassRoomService;

@RestController
@RequestMapping("api/classrooms")
public class ClassroomController {

	@Autowired
	ClassRoomService service;
	
	@GetMapping("/all_classrooms")
	public List<Classroom> getAllClassRooms() {
		return service.getAllClassRooms();
		};
		
	@GetMapping("/classroombyid/{id}")
	public List<Classroom> getClassRoomById(@PathVariable long id)
	{
		return service.getClassRoomById(id);	
	};
	
	@PostMapping("/createclassroom")
	public String createClassRoom(@RequestBody Classroom c) {
		return service.createClassRoom(c);
	};
	@PutMapping("/updateclassroombyid/{classroomId}/{classroom_name}")
	public String updateClassRoom(@PathVariable long classroomId ,@PathVariable String classroom_name) {
		return service.updateClassRoom(classroomId,classroom_name);
	}	
	@DeleteMapping("/deleteclassroombyid/{classroomid}")
	public String deleteClassroomById(@PathVariable long classroomid) {
		return service.deleteClassroomById(classroomid);
	}
	
	
}
