
package com.spring.tasks20.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "class_schedule")
public class ClassSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long classScheduleId;

	private String dayOfWeek;

	private LocalTime startTime;

	private LocalTime endTime;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "classroom_id")
	private Classroom classroom;

	@ManyToOne()
	@JoinColumn(name = "subjectId")
	private Subject subject;

	public long getClassScheduleId() {
		return classScheduleId;
	}

	public void setClassScheduleId(long classScheduleId) {
		this.classScheduleId = classScheduleId;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ClassSchedule [classScheduleId=" + classScheduleId + ", dayOfWeek=" + dayOfWeek + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}

}
