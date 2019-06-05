package com.serviceImp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.entity.User;
import com.service.UserService;
@Service("userService")
public class UserServiceImp implements UserService{
	
	@Resource
	private UserMapper um;
	public void setUm(UserMapper um) {
		this.um = um;
	}


	/**
	 * ÑéÖ¤µÇÂ¼
	 */
	@Override
	public User findByAccountPwd(String userAccount, String pwd, Integer status) {
		User user=um.findByAccountPwd(userAccount, pwd, status);
		return user;
	}

}
