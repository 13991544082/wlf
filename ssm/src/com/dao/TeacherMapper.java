package com.dao;

import java.util.List;

import com.entity.Teacher;

public interface TeacherMapper {
	/**
	 * 获取所有老师
	 */
	public List<Teacher> findAll();
	
	
}
