package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;

public class PathInterceptor implements HandlerInterceptor{
	
	/**
	 * ����Ƿ�����
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		System.out.println("==================����������===================");
		boolean flag=false;
		String requestPath=request.getRequestURI();
		//��ȡsession����
		HttpSession session=request.getSession();
		//��ȡuser
		User user=(User)session.getAttribute("user");
		System.out.println(user);
		//�ж��û��Ƿ��¼(Ҳ�����Ƿ�Ϊ��)
		if(user!=null){
			flag=true;
		}else if(requestPath.endsWith("login.do")){
			flag=true;
		}
		else{
			//�ض���403ҳ��
			response.sendRedirect(request.getContextPath()+"/403.jsp");
			System.out.println(request.getContextPath()+"/403.jsp");
		}

		return flag;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

	
	
	
}
