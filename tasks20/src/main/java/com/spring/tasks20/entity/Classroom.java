package com.spring.tasks20.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classroom")
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long classroomId;

	private String classroomName;

	public long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(long classroomId) {
		this.classroomId = classroomId;
	}

	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", classroomName=" + classroomName + "]";
	}

}
