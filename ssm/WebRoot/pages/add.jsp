<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加</title>
    <style type="text/css">
    	table{
			width:auto;
			border:1px solid blue;
		}
    </style>
     <!-- 引入jQuery的支持 -->
    <script type="text/javascript" src="<%=path %>/js/jquery-1.11.0.js"></script>
     <!-- 引入工具util.js的支持 -->
    <script type="text/javascript" src="<%=path %>/js/util.js"></script>
   
  </head>
  
  <body>
  	<form action="<%=path %>/stuInfoController/add.do" method="post">
	    <table align="center" border="1px" cellpadding="5px" cellspacing="0">
	    	<tr>
	    		<td>
	    			姓名
	    		</td>
	    		<td>
	    			<input type="text" name="sname"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			性别
	    		</td>
	    		<td>
	    			男<input type="radio" name="sex" value="男"/>&nbsp;
	    			女<input type="radio" name="sex" value="女"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			生日
	    		</td>
	    		<td>
	    			<input type="date" name="birthday"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			电话
	    		</td>
	    		<td>
	    			<input type="text" name="phone"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			微信
	    		</td>
	    		<td>
	    			<input type="text" name="wechat"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			毕业学校
	    		</td>
	    		<td>
	    			<input type="text" name="gschool"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			专业
	    		</td>
	    		<td>
	    			<input type="text" name="major"/>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			毕业时间
	    		</td>
	    		<td>
	    			<input type="date" name="gdate"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			所在班级
	    		</td>
	    		<td>
	    			<select id="classId" name="classId">
	    				<c:forEach items="${clazzList}" var="clazz">
	    					<option value="${clazz.id}">${clazz.cname}</option>
	    				</c:forEach>
	    			</select>
	    		</td>
	    	</tr> 	
	    	<tr>
	    		<td>
	    			地址
	    		</td>
	    		<td>
	    			<input type="text" name="addr"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td align="center" colspan="2">
	    			<input type="reset"/>&nbsp;&nbsp;
	    			<input type="submit"/>
	    		</td>
	    	</tr>
	    </table>
	  </form> 
  </body>
</html>
