package com.service;

import org.apache.ibatis.annotations.Param;

import com.entity.User;

public interface UserService {
	
	/**
	 * ��֤��¼
	 */
	public User findByAccountPwd(String userAccount,String pwd,Integer status);
	
}	
