package com.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.StuInfoMapper;
import com.dao.UserMapper;
import com.entity.PageBean;
import com.entity.StuInfo;
import com.entity.User;
import com.service.StuInfoService;
import com.service.UserService;
@Service
public class StuInfoServiceImp implements StuInfoService{
	@Resource
	private StuInfoMapper sim;
	public void setSim(StuInfoMapper sim) {
		this.sim = sim;
	}

	/**
	 * 查询所有学生
	 */
	@Override
	public List<StuInfo> findAllStuInfos() {
		List<StuInfo> stuInfoList=sim.findAllStuInfos();
		return stuInfoList;
	}
	
	/**
	 * 查询总数
	 */
	@Override
	public Integer findCount(String sname) {
		Integer count=sim.findCount(sname);
		return count;
	}

	/**
	 * 查询总页数
	 */
	@Override
	public Integer findCountPage(Integer pageSize,String sname) {
		Integer count=findCount(sname);
		if(count==null){
			count=0;
		}
		//计算总页数
		int totalPage=0;
		totalPage=(count%pageSize==0?count/pageSize:(count/pageSize)+1);
		return totalPage;
	}
	
	
	/**
	 * 查询所有学生带分页
	 */
	@Override
	public PageBean findStuInfosByPage(Integer currentPage) {
	
		PageBean pb=new PageBean();

		if(currentPage==null){
			currentPage=1;//设置当前页为1
		}
		
		
		Integer pageSize=pb.getPageSize();//获取每页显示的条数
		Integer totalPage=findCountPage(pageSize,null);//获取总页数
		Integer count=findCount(null);//获取总数
		
		//获取分页数据
		Integer start=(currentPage-1)*pageSize;
		Integer size=pageSize;
		List<StuInfo> pageData=sim.findByPageData(start,size,null);
		
		
		//往pb对象中设值
		pb.setPageData(pageData);
		pb.setCurrentPage(currentPage);
		pb.setTotalPage(totalPage);
		pb.setCount(count);

		return pb;
	}
	
	/**
	 * 通过名字模糊查询所有学生带分页
	 */
	@Override
	public PageBean findStuInfosByPageSname(Integer currentPage,String sname) {
		System.out.println(sname+"模糊查询");
		PageBean pb=new PageBean();

		if(currentPage==null){
			currentPage=1;//设置当前页为1
		}
		
		
		Integer pageSize=pb.getPageSize();//获取每页显示的条数
		Integer totalPage=findCountPage(pageSize,sname);//获取总页数
		Integer count=findCount(sname);//获取总数
		
		//获取分页数据
		Integer start=(currentPage-1)*pageSize;
		Integer size=pageSize;
		List<StuInfo> pageData=sim.findByPageData(start,size,sname);

		//往pb对象中设值
		pb.setPageData(pageData);
		pb.setCurrentPage(currentPage);
		pb.setTotalPage(totalPage);
		pb.setCount(count);
		return pb;
	}

	/**
	 * 添加学生
	 */
	@Override
	public boolean add(StuInfo stuInfo) {
		int num=sim.add(stuInfo);
		return num>0?true:false;
	}
	
	/**
	 * 通过id查询学生
	 */
	@Override
	public StuInfo findByIdStuInfo(Integer id) {
		StuInfo stuInfo=sim.findByIdStuInfo(id);
		return stuInfo;
	}
	
	/**
	 * 通过id修改学生
	 */
	@Override
	public boolean editStuInfo(StuInfo stuInfo) {
		int num=sim.editStuInfo(stuInfo);
		return num>0?true:false;
	}

	
	
	

}
