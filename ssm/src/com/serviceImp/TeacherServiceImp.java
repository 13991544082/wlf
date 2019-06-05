package com.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.TeacherMapper;
import com.dao.UserMapper;
import com.entity.Teacher;
import com.entity.User;
import com.service.TeacherService;
import com.service.UserService;
@Service
public class TeacherServiceImp implements TeacherService{
	@Resource
	private TeacherMapper tm;
	public void setTm(TeacherMapper tm) {
		this.tm = tm;
	}
	
	/**
	 * 获取所有老师
	 */
	@Override
	public List<Teacher> findAll() {
		List<Teacher> teacherList=tm.findAll();
		return teacherList;
	}
	
	
}
