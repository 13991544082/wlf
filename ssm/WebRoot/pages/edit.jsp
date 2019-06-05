<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改</title>
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
    <script type="text/javascript">
    	$(function(){
    		$("#btn").click(function(){
    			window.location.href="<%=path %>/stuInfoController/stuInfosPage.do";
    		});
    	});
    </script>
   
  </head>
  
  <body>
  	<form action="<%=path %>/stuInfoController/edit.do" method="post">
	    <table align="center" border="1px" cellpadding="5px" cellspacing="0">
	    	<input type="hidden" name="id" value="${stuInfo.id}"/>
	    	<tr>
	    		<td>
	    			姓名
	    		</td>
	    		<td>
	    			<input type="text" name="sname" value="${stuInfo.sname}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			性别
	    		</td>
	    		<td>
	    			<c:choose>
	    				<c:when test="${stuInfo.sex == '男'}">
	    					男<input type="radio" name="sex" value="男" checked="checked"/>
	    				</c:when>
	    				<c:otherwise>
	    					男<input type="radio" name="sex" value="男"/>
	    				</c:otherwise>
	    			</c:choose>
	    			
	    			&nbsp;
	    			<c:choose>
	    				<c:when test="${stuInfo.sex == '女'}">
	    					女<input type="radio" name="sex" value="女" checked="checked"/>
	    				</c:when>
	    				<c:otherwise>
	    					女<input type="radio" name="sex" value="女"/>
	    				</c:otherwise>
	    			</c:choose>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			生日
	    		</td>
	    		<td>
	    			<input type="date" name="birthday" value="<fmt:formatDate value='${stuInfo.birthday}' pattern='yyyy-MM-dd'/>"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			电话
	    		</td>
	    		<td>
	    			<input type="text" name="phone" value="${stuInfo.phone}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			微信
	    		</td>
	    		<td>
	    			<input type="text" name="wechat" value="${stuInfo.wechat}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			毕业学校
	    		</td>
	    		<td>
	    			<input type="text" name="gschool" value="${stuInfo.gschool}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			专业
	    		</td>
	    		<td>
	    			<input type="text" name="major" value="${stuInfo.major}"/>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			毕业时间
	    		</td>
	    		<td>
	    			<input type="date" name="gdate" value="<fmt:formatDate value='${stuInfo.gdate}' pattern='yyyy-MM-dd'/>"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			所在班级
	    		</td>
	    		<td>
	    			<select id="classId" name="classId">
	    				<c:forEach items="${clazzList}" var="clazz">
	    					<c:if test="${clazz.id == stuInfo.classId}">
	    						<option value="${clazz.id}" selected="selected">${clazz.cname}</option>
	    					</c:if>
	    					<c:if test="${clazz.id != stuInfo.classId}">
	    						<option value="${clazz.id}">${clazz.cname}</option>
	    					</c:if>
	    				</c:forEach>
	    			</select>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>
	    			地址
	    		</td>
	    		<td>
	    			<input type="text" name="addr" value="${stuInfo.addr}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td align="center" colspan="2">
	    			<input type="button" id="btn" value="返回"/>&nbsp;&nbsp;
	    			<input type="submit"/>
	    		</td>
	    	</tr>
	    	<c:if test="${msg==null}">	
		    	<tr style="display: none">
		    		<td colspan="2">
		    			<span id="errorMsg" style="color:red">${msg}</span>
		    		</td>
		    	</tr>
	    	</c:if>
	    	<c:if test="${msg!=null}">	
		    	<tr>
		    		<td colspan="2" align="center">
		    			<span id="errorMsg" style="color:red">${msg}</span>
		    		</td>
		    	</tr>
	    	</c:if>
	    </table>
	  </form> 
  </body>
</html>
