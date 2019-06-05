package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Clazz;
import com.entity.User;

public interface ClazzMapper {
	/**
	 *	获取所有班级
	 */
	public List<Clazz> findAll();
	
	/**
	 *	保存班级
	 */
	public int save(Clazz clazz);
	
	
}
