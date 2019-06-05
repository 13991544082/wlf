package com.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ClazzMapper;
import com.dao.UserMapper;
import com.entity.Clazz;
import com.entity.User;
import com.service.ClazzService;
import com.service.UserService;
@Service
public class ClazzServiceImp implements ClazzService{
	@Resource
	private ClazzMapper cm;
	
	public void setCm(ClazzMapper cm) {
		this.cm = cm;
	}

	/***
	 * ��ȡ���а༶
	 */
	@Override
	public List<Clazz> findAll() {
		List<Clazz> clazzList=cm.findAll();
		return clazzList;
	}
	
	/***
	 * ���濪����Ϣ
	 */
	@Override
	public boolean save(Clazz clazz) {
		int num=cm.save(clazz);
		return num>0?true:false;
	}
	
	
}
