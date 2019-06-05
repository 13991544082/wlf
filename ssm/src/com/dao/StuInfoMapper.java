package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.StuInfo;
import com.entity.User;

public interface StuInfoMapper {
	/**
	 * ��ѯ����ѧ����Ϣ
	 */
	public List<StuInfo> findAllStuInfos();
	
	/**
	 * ��ѯ����
	 */
	public int findCount(@Param("sname")String sname);
	
	
	/**
	 * ��ҳ��ѯ����
	 */
	public List<StuInfo> findByPageData(@Param("start")Integer start, @Param("size")Integer size,@Param("sname")String sname);

	/**
	 * ���ѧ��
	 */
	public int add(StuInfo stuInfo);
	
	/**
	 * ͨ��ID��ѯѧ��
	 */
	public StuInfo findByIdStuInfo(Integer id);
	
	/**
	 * ͨ��ID�޸�ѧ��
	 */
	public int editStuInfo(StuInfo stuInfo);
	
	
}
