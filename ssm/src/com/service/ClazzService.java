package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Clazz;
import com.entity.User;

public interface ClazzService {
	
	/**
	 * 获取所有班级
	 */
	public List<Clazz> findAll();
	
	/**
	 * 保存开班信息
	 */
	public boolean save(Clazz clazz);
	
}	
