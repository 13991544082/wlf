<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>403</title>
  </head>
  
  <body>
	    <h1>不好意思,您没有权限访问</h1>
	    <a href="<%=path %>/index.jsp">返回登录</a>
  </body>
</html>
