<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录</title>
    <!-- 引入jQuery的支持 -->
    <script type="text/javascript" src="<%=path %>/js/jquery-1.11.0.js"></script>
    <style type="text/css">
    	table{
    		width:450px;
    		height:200px;
    		border:1px solid blue;
    		
    	}
    </style>
    <script type="text/javascript">
    	$(function(){
    
    		//账号失去焦点事件
    		$("#userAccount").blur(function(){   
    			var userAccount=$("#userAccount").val(); 			
    			if(userAccount==null || userAccount==""){
    				$("#span1").html("账号不能为空");
    				return;
    			}
    		});
    		//密码失去焦点事件
    		$("#pwd").blur(function(){
    			var pwd=$("#pwd").val();
    			if(pwd==null || pwd==""){
    				$("#span2").html("密码不能为空");
    				return;
    			}
    		});
    		
    		//给button添加单击事件
    		$("#btn").click(function(){
    			var userAccount=$("#userAccount").val();
    			var pwd=$("#pwd").val(); 	
    			//异步发送到后台验证登录
	    		$.post("<%=path %>/userController/login.do", {"userAccount":userAccount,"pwd":pwd},
				   function(data){
				     if(data==true){
				     	//跳转到主页面
				     	window.location.href="<%=path %>/stuInfoController/stuInfosPage.do";
				     }else{
				     	$("#span3").html("用户名或密码输入有误");
				     }
				}, "json");
	    			
	    	});
    		
    		
    	
    	});
    </script>
  </head>
  
  <body>
	    <table border="1px" align="center" cellpadding="5px" cellspacing="0">
	    	<tr>
	    		<td align="center" colspan="2" style="font-size:20px">行政管理登录</td>
	    	</tr>
	    	<tr>
	    		<td align="center">账号</td>
	    		<td>
	    			<input type="text" id="userAccount" name="userAccount" value="wang123456"/>
	    			<span id="span1" style="color:red"></span>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td align="center">密码</td>
	    		<td>
	    			<input type="text" id="pwd" name="pwd" value="123456"/>
	    			<span id="span2" style="color:red"></span>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2" align="center">
	    			<span id="span3" style="color:red"></span>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td colspan="2" align="center">
	    			<input type="reset"/>&nbsp;&nbsp;
	    			<input type="button" value="登录" id="btn"/>
	    		</td>
	    	</tr>
	    </table>
  </body>
</html>
