package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.entity.Clazz;
import com.service.ClazzService;
import com.util.Msg;

@Controller
@RequestMapping("/clazzController")
public class ClazzController {
	@Resource
	private ClazzService cs;
	public void setCs(ClazzService cs) {
		this.cs = cs;
	}

	/**
	 * 获取所有班级
	 */
	@RequestMapping("/findAll.do")
	public void findAll(HttpServletRequest request,HttpSession session,HttpServletResponse response){
		List<Clazz> clazzList=cs.findAll();
		session.setAttribute("clazzList",clazzList);
		try {
			response.sendRedirect(request.getContextPath()+"/pages/add.jsp");
		} catch (IOException e) {
			System.out.println("跳转失败...");
		}
	}
	

	/**
	 * 处理开班
	 */
	@RequestMapping("/openClazz.do")
	public @ResponseBody void openClazz(Clazz clazz,HttpServletRequest request,HttpSession session,HttpServletResponse response){
		clazz.setCycle(Msg.CLAZZ_CYCLE);//设置班级周期
		boolean flag=cs.save(clazz);//保存开班信息
		
		String json=JSONObject.toJSONString(flag);
		System.out.println(json);
		PrintWriter out;
		try {
			out = response.getWriter();
			out.print(json);
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("写出失败....");
		}
	}

}
