package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.entity.Clazz;
import com.entity.Teacher;
import com.entity.User;
import com.service.ClazzService;
import com.service.TeacherService;
import com.service.UserService;
import com.util.Msg;

@Controller
@RequestMapping("/userController")
public class UserController {
	@Resource
	private UserService us;
	@Resource
	private ClazzService cs;
	@Resource
	private TeacherService ts;
	public void setUs(UserService us) {
		this.us = us;
	}
	public void setCs(ClazzService cs) {
		this.cs = cs;
	}
	public void setTs(TeacherService ts) {
		this.ts = ts;
	}
	/**
	 * 验证登录
	 */
	@RequestMapping("/login.do")
	public @ResponseBody void login(String userAccount,String pwd ,HttpServletResponse response,HttpSession session){
		User user=us.findByAccountPwd(userAccount, pwd, Msg.USER_STATUS_Y);
		boolean flag=false;
		if(user!=null){
			session.setAttribute("user", user);//将用户放入session中
			List<Clazz> clazzList=cs.findAll();
			session.setAttribute("clazzList", clazzList);//将班级集合放入session中
			List<Teacher> teacherList=ts.findAll();
			session.setAttribute("teacherList", teacherList);//将老师集合放入session中
			flag=true;
		}

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
	
	/**
	 * 安全退出功能
	 */
	@RequestMapping("/exit.do")
	public String exit(HttpSession session){
		//让session销毁
		session.invalidate();
		return "redirect:/index.jsp";
	}

}
