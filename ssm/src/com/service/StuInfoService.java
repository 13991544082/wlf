package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.PageBean;
import com.entity.StuInfo;
import com.entity.User;

public interface StuInfoService {
	
	/**
	 * 查询所有学生
	 */
	public List<StuInfo>  findAllStuInfos();
	
	/**
	 * 查询总数
	 */
	public Integer findCount(String sname);
	
	/**
	 * 查询总页数
	 */
	public Integer findCountPage(Integer pageSize,String sname);
	
	/**
	 * 查询所有学生带分页
	 */
	public PageBean findStuInfosByPage(Integer currentPage);
	
	/**
	 * 通过名字模糊查询所有学生带分页
	 */
	PageBean findStuInfosByPageSname(Integer currentPage, String sname);

	/**
	 * 添加学生
	 */
	public boolean add(StuInfo stuInfo);
	
	/**
	 * 通过id查找学生
	 */
	public StuInfo findByIdStuInfo(Integer id);
	
	/**
	 * 通过id修改学生
	 */
	public boolean editStuInfo(StuInfo stuInfo);

	
	
}	
