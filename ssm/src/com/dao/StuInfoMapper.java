package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.StuInfo;
import com.entity.User;

public interface StuInfoMapper {
	/**
	 * 查询所有学生信息
	 */
	public List<StuInfo> findAllStuInfos();
	
	/**
	 * 查询总数
	 */
	public int findCount(@Param("sname")String sname);
	
	
	/**
	 * 分页查询数据
	 */
	public List<StuInfo> findByPageData(@Param("start")Integer start, @Param("size")Integer size,@Param("sname")String sname);

	/**
	 * 添加学生
	 */
	public int add(StuInfo stuInfo);
	
	/**
	 * 通过ID查询学生
	 */
	public StuInfo findByIdStuInfo(Integer id);
	
	/**
	 * 通过ID修改学生
	 */
	public int editStuInfo(StuInfo stuInfo);
	
	
}
