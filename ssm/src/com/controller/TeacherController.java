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
@RequestMapping("/teacherController")
public class TeacherController {
	@Resource
	private TeacherService ts;
	public void setTs(TeacherService ts) {
		this.ts = ts;
	}

	/**
	 * 获取所有老师
	 */
	@RequestMapping("/findAll.do")
	public String findAll(){
		List<Teacher> teacherList=ts.findAll();
		return "";
	}
	
	
}
