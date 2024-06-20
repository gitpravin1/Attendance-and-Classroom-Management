package com.spring.tasks20.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.tasks20.dao.ClassroomDao;
import com.spring.tasks20.entity.Classroom;

@Service
public class ClassRoomService {

	@Autowired
	ClassroomDao dao;
	
	public List<Classroom> getAllClassRooms() {
		// TODO Auto-generated method stub
		return dao.getAllClassRooms();
		
	}

	public List<Classroom> getClassRoomById(long id) {
		// TODO Auto-generated method stub
		return dao.getClassRoomById(id);
	}

	public String createClassRoom(Classroom c) {
		// TODO Auto-generated method stub
		return dao.createClassRoom(c);
	}

	public String updateClassRoom(long classroomId ,String classroom_name) {
		// TODO Auto-generated method stub
	  return dao.updateClassRoom(classroomId,classroom_name);	
	}

	public String deleteClassroomById(long classroomid) {
		// TODO Auto-generated method stub
		return dao.deleteClassroomById(classroomid);
	}

}
