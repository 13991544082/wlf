package com.service;

import java.util.List;

import com.entity.Teacher;

public interface TeacherService {
	
	/**
	 * 获取所有老师
	 */
	public List<Teacher> findAll();
	
}	
