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
	 * 获取所有学生，去main页面展示
	 */
	/*@RequestMapping("/stuInfos.do")
	public String stuInfos(Model model){
		List<StuInfo> stuInfoList=sim.findAllStuInfos();
		model.addAttribute("stuInfoList",stuInfoList);
		return "main";
	}*/
	
	
	/**
	 * 获取所有学生带分页，去main页面展示
	 */
	@RequestMapping("/stuInfosPage.do")
	public String stuInfos(String sname,Integer currentPage,Model model){
		System.out.println("controller==="+sname);
		if(sname==null || sname==""){
			//分页处理
			PageBean pb=sim.findStuInfosByPage(currentPage);
			model.addAttribute("pb",pb);
		}else{
			//分页处理
			PageBean pb=sim.findStuInfosByPageSname(currentPage,sname);
			model.addAttribute("pb",pb);
		}
		return "main";
	}
	
	/**
	 * 添加学生
	 */
	@RequestMapping("/add.do")
	public String add(StuInfo stuInfo,Model model){
		System.out.println(stuInfo);
		boolean flag=sim.add(stuInfo);
		//添加成功去展示页面
		if(flag){
			return stuInfos(null,null,model);
		}
		return "add";
	}
	
	/**
	 * 通过ID修改学生
	 */
	@RequestMapping("/edit.do")
	public String edit(StuInfo stuInfo,Model model){
		boolean flag=sim.editStuInfo(stuInfo);
		if(flag){//去展示页面
			return stuInfos(null,null,model);
		}else{
			Integer id=stuInfo.getId();//获取学生的id
			model.addAttribute("msg","修改失败....");
			return findById(id,model);
		}
	}
	
	/**
	 * 通过ID查找学生
	 */
	@RequestMapping("/findById.do")
	public String findById(Integer id,Model model){
		StuInfo stuInfo=sim.findByIdStuInfo(id);
		model.addAttribute("stuInfo",stuInfo);
		return "edit";
	}
}
