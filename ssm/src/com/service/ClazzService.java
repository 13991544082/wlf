package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Clazz;
import com.entity.User;

public interface ClazzService {
	
	/**
	 * ��ȡ���а༶
	 */
	public List<Clazz> findAll();
	
	/**
	 * ���濪����Ϣ
	 */
	public boolean save(Clazz clazz);
	
}	
