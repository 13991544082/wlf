package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Clazz;
import com.entity.User;

public interface ClazzMapper {
	/**
	 *	��ȡ���а༶
	 */
	public List<Clazz> findAll();
	
	/**
	 *	����༶
	 */
	public int save(Clazz clazz);
	
	
}
