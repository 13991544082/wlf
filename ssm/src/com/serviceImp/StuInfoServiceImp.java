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
	 * ��ѯ����ѧ��
	 */
	@Override
	public List<StuInfo> findAllStuInfos() {
		List<StuInfo> stuInfoList=sim.findAllStuInfos();
		return stuInfoList;
	}
	
	/**
	 * ��ѯ����
	 */
	@Override
	public Integer findCount(String sname) {
		Integer count=sim.findCount(sname);
		return count;
	}

	/**
	 * ��ѯ��ҳ��
	 */
	@Override
	public Integer findCountPage(Integer pageSize,String sname) {
		Integer count=findCount(sname);
		if(count==null){
			count=0;
		}
		//������ҳ��
		int totalPage=0;
		totalPage=(count%pageSize==0?count/pageSize:(count/pageSize)+1);
		return totalPage;
	}
	
	
	/**
	 * ��ѯ����ѧ������ҳ
	 */
	@Override
	public PageBean findStuInfosByPage(Integer currentPage) {
	
		PageBean pb=new PageBean();

		if(currentPage==null){
			currentPage=1;//���õ�ǰҳΪ1
		}
		
		
		Integer pageSize=pb.getPageSize();//��ȡÿҳ��ʾ������
		Integer totalPage=findCountPage(pageSize,null);//��ȡ��ҳ��
		Integer count=findCount(null);//��ȡ����
		
		//��ȡ��ҳ����
		Integer start=(currentPage-1)*pageSize;
		Integer size=pageSize;
		List<StuInfo> pageData=sim.findByPageData(start,size,null);
		
		
		//��pb��������ֵ
		pb.setPageData(pageData);
		pb.setCurrentPage(currentPage);
		pb.setTotalPage(totalPage);
		pb.setCount(count);

		return pb;
	}
	
	/**
	 * ͨ������ģ����ѯ����ѧ������ҳ
	 */
	@Override
	public PageBean findStuInfosByPageSname(Integer currentPage,String sname) {
		System.out.println(sname+"ģ����ѯ");
		PageBean pb=new PageBean();

		if(currentPage==null){
			currentPage=1;//���õ�ǰҳΪ1
		}
		
		
		Integer pageSize=pb.getPageSize();//��ȡÿҳ��ʾ������
		Integer totalPage=findCountPage(pageSize,sname);//��ȡ��ҳ��
		Integer count=findCount(sname);//��ȡ����
		
		//��ȡ��ҳ����
		Integer start=(currentPage-1)*pageSize;
		Integer size=pageSize;
		List<StuInfo> pageData=sim.findByPageData(start,size,sname);

		//��pb��������ֵ
		pb.setPageData(pageData);
		pb.setCurrentPage(currentPage);
		pb.setTotalPage(totalPage);
		pb.setCount(count);
		return pb;
	}

	/**
	 * ���ѧ��
	 */
	@Override
	public boolean add(StuInfo stuInfo) {
		int num=sim.add(stuInfo);
		return num>0?true:false;
	}
	
	/**
	 * ͨ��id��ѯѧ��
	 */
	@Override
	public StuInfo findByIdStuInfo(Integer id) {
		StuInfo stuInfo=sim.findByIdStuInfo(id);
		return stuInfo;
	}
	
	/**
	 * ͨ��id�޸�ѧ��
	 */
	@Override
	public boolean editStuInfo(StuInfo stuInfo) {
		int num=sim.editStuInfo(stuInfo);
		return num>0?true:false;
	}

	
	
	

}
