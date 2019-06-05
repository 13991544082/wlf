package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.PageBean;
import com.entity.StuInfo;
import com.service.StuInfoService;

@Controller
@RequestMapping("/stuInfoController")
public class StuInfoController {
	@Resource
	private StuInfoService sim;
	public void setSim(StuInfoService sim) {
		this.sim = sim;
	}

	/**
	 * ��ȡ����ѧ����ȥmainҳ��չʾ
	 */
	/*@RequestMapping("/stuInfos.do")
	public String stuInfos(Model model){
		List<StuInfo> stuInfoList=sim.findAllStuInfos();
		model.addAttribute("stuInfoList",stuInfoList);
		return "main";
	}*/
	
	
	/**
	 * ��ȡ����ѧ������ҳ��ȥmainҳ��չʾ
	 */
	@RequestMapping("/stuInfosPage.do")
	public String stuInfos(String sname,Integer currentPage,Model model){
		System.out.println("controller==="+sname);
		if(sname==null || sname==""){
			//��ҳ����
			PageBean pb=sim.findStuInfosByPage(currentPage);
			model.addAttribute("pb",pb);
		}else{
			//��ҳ����
			PageBean pb=sim.findStuInfosByPageSname(currentPage,sname);
			model.addAttribute("pb",pb);
		}
		return "main";
	}
	
	/**
	 * ���ѧ��
	 */
	@RequestMapping("/add.do")
	public String add(StuInfo stuInfo,Model model){
		System.out.println(stuInfo);
		boolean flag=sim.add(stuInfo);
		//��ӳɹ�ȥչʾҳ��
		if(flag){
			return stuInfos(null,null,model);
		}
		return "add";
	}
	
	/**
	 * ͨ��ID�޸�ѧ��
	 */
	@RequestMapping("/edit.do")
	public String edit(StuInfo stuInfo,Model model){
		boolean flag=sim.editStuInfo(stuInfo);
		if(flag){//ȥչʾҳ��
			return stuInfos(null,null,model);
		}else{
			Integer id=stuInfo.getId();//��ȡѧ����id
			model.addAttribute("msg","�޸�ʧ��....");
			return findById(id,model);
		}
	}
	
	/**
	 * ͨ��ID����ѧ��
	 */
	@RequestMapping("/findById.do")
	public String findById(Integer id,Model model){
		StuInfo stuInfo=sim.findByIdStuInfo(id);
		model.addAttribute("stuInfo",stuInfo);
		return "edit";
	}
}
