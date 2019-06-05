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
	 * ��֤��¼
	 */
	@RequestMapping("/login.do")
	public @ResponseBody void login(String userAccount,String pwd ,HttpServletResponse response,HttpSession session){
		User user=us.findByAccountPwd(userAccount, pwd, Msg.USER_STATUS_Y);
		boolean flag=false;
		if(user!=null){
			session.setAttribute("user", user);//���û�����session��
			List<Clazz> clazzList=cs.findAll();
			session.setAttribute("clazzList", clazzList);//���༶���Ϸ���session��
			List<Teacher> teacherList=ts.findAll();
			session.setAttribute("teacherList", teacherList);//����ʦ���Ϸ���session��
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
			System.out.println("д��ʧ��....");
		}
	}
	
	/**
	 * ��ȫ�˳�����
	 */
	@RequestMapping("/exit.do")
	public String exit(HttpSession session){
		//��session����
		session.invalidate();
		return "redirect:/index.jsp";
	}

}
