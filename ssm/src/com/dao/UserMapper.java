package com.dao;

import org.apache.ibatis.annotations.Param;

import com.entity.User;

public interface UserMapper {
	/**
	 * ��֤��¼
	 */
	public User findByAccountPwd(@Param("userAccount")String account,@Param("pwd")String pwd,@Param("status")Integer status);
	
	
}
