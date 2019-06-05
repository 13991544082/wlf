package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.PageBean;
import com.entity.StuInfo;
import com.entity.User;

public interface StuInfoService {
	
	/**
	 * ��ѯ����ѧ��
	 */
	public List<StuInfo>  findAllStuInfos();
	
	/**
	 * ��ѯ����
	 */
	public Integer findCount(String sname);
	
	/**
	 * ��ѯ��ҳ��
	 */
	public Integer findCountPage(Integer pageSize,String sname);
	
	/**
	 * ��ѯ����ѧ������ҳ
	 */
	public PageBean findStuInfosByPage(Integer currentPage);
	
	/**
	 * ͨ������ģ����ѯ����ѧ������ҳ
	 */
	PageBean findStuInfosByPageSname(Integer currentPage, String sname);

	/**
	 * ���ѧ��
	 */
	public boolean add(StuInfo stuInfo);
	
	/**
	 * ͨ��id����ѧ��
	 */
	public StuInfo findByIdStuInfo(Integer id);
	
	/**
	 * ͨ��id�޸�ѧ��
	 */
	public boolean editStuInfo(StuInfo stuInfo);

	
	
}	
