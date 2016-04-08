package com.hhit.entity;

import java.sql.Timestamp;
import java.util.Set;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Course.java
//  @ Date : 2016/4/7
//  @ Author : 
//
//




public class Course implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String courseName;
	private Integer courseLevel;
	private Timestamp addTime;
	private String description;
	private Department department;
	private UserDetails teacher;
	private Set<Task> tasks;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(Integer courseLevel) {
		this.courseLevel = courseLevel;
	}
	public Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public UserDetails getTeacher() {
		return teacher;
	}
	public void setTeacher(UserDetails teacher) {
		this.teacher = teacher;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
