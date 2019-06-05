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
    <title>主页面</title>
    <style type="text/css">
    	table{
    		width:100%;
    		border:1px solid blue;
    	}
    	#header{
    		height:100px;
    		background-color: wheat;
    	}
    </style>
     <!-- 引入jQuery的支持 -->
    <script type="text/javascript" src="<%=path %>/js/jquery-1.11.0.js"></script>
     <!-- 引入工具util.js的支持 -->
    <script type="text/javascript" src="<%=path %>/js/util.js"></script>
    <style type="text/css">
    	
    </style>
    <script type="text/javascript">
    	$(function(){
    		var today=nowDate();
    		$("#today").html(today);
    		
    		/****************异步处理开班操作*****************/
    		$("#btn").click(function(){
    			var cname=$("#cname").val();
    			var tid1=$("#tid1").val();
    			var tid2=$("#tid2").val();
    			$.post("<%=path %>/clazzController/openClazz.do", {"cname":cname,"tid1":tid1,"tid2":tid2},
				   function(data){
				     if(data==true){
				    	alert("开班成功,好高兴...");
				     }else{
				     	 $("#error").html("开班失败,请检查...");
				     }
				}, "json");
    		});
    		
    	});
    </script>
    
    
  </head>
  
  <body>
  		<div id="header">
  			今天是:<span id="today"></span>&nbsp;&nbsp;
  			欢迎${user.userName}&nbsp;&nbsp;
  			<a href="<%=path %>/userController/exit.do">安全退出</a>
  			<div id="select">
  				<form action="<%=path %>/stuInfoController/stuInfosPage.do" method="post">
	  				<input type="text" name="sname" id="sname" value="请输入姓名..."/>
	  				<input type="submit" id="selectbtn" value="搜索"/>
  				</form>
  			</div>
  			<!-- 
  			<fieldset>
  				<legend>
  					开班信息
  				</legend>
  			</fieldset>
  			 -->
  			<div style="text-align:right">
 				班级名称<input type="text" id="cname" name="cname"/>
 				授课老师<select id="tid1">
    						<c:forEach items="${teacherList}" var="teacher">
    							<c:if test="${teacher.status==1}">	
    								<option value="${teacher.id}">${teacher.tname}</option>
    							</c:if>
    						</c:forEach>
    				  </select>
 				就业老师<select id="tid2">
    						<c:forEach items="${teacherList}" var="teacher">
    							<c:if test="${teacher.status==2}">	
    								<option value="${teacher.id}">${teacher.tname}</option>
    							</c:if>
    						</c:forEach>
    				   </select><br/>
    				   <span id="error" style="color:red"></span>
    			<input type="button" id="btn" value="开班"/>
 			</div>
  		</div>
	    <table border="1px" cellpadding="5px" cellspacing="0">
	    	<tr>
	    		<td align="center">编号</td>
	    		<td align="center">姓名</td>
	    		<td align="center">性别</td>
	    		<td align="center">生日</td>
	    		<td align="center">电话</td>
	    		<td align="center">微信</td>
	    		<td align="center">毕业院校</td>
	    		<td align="center">专业</td>
	    		<td align="center">毕业时间</td>
	    		<td align="center">地址</td>
	    		<td align="center">班级</td>
	    		<td align="center">操作</td>
	    	</tr>
	    	<c:forEach items="${pb.pageData}" var="stuInfo">
	    	<tr>
	    		<td align="center">${stuInfo.id}</td>
	    		<td align="center">${stuInfo.sname}</td>
	    		<td align="center">${stuInfo.sex}</td>
	    		<td align="center"><fmt:formatDate value="${stuInfo.birthday}" pattern="yyyy-MM-dd"/></td>
	    		<td align="center">${stuInfo.phone}</td>
	    		<td align="center">${stuInfo.wechat}</td>
	    		<td align="center">${stuInfo.gschool}</td>
	    		<td align="center">${stuInfo.major}</td>
	    		<td align="center"><fmt:formatDate value="${stuInfo.gdate}" pattern="yyyy-MM-dd"/></td>
	    		<td align="center">${stuInfo.addr}</td>
	    		<td align="center">${stuInfo.classId}</td>
	    		<td align="center">
	    			<a href="<%=path %>/pages/add.jsp">添加</a>
	    			<a href="<%=path %>/stuInfoController/findById.do?id=${stuInfo.id}">编辑</a>
	    		</td>
	    	</tr>
	    	</c:forEach>
	    	<tr>
	    		<td align="center" colspan="12">
	    			<a href="<%=path %>/stuInfoController/stuInfosPage.do?currentPage=1">首页</a>&nbsp;&nbsp;
		    		
		    		<c:if test="${pb.currentPage==1}">
		    			上一页&nbsp;&nbsp;
		    		</c:if>
		    		<c:if test="${pb.currentPage!=1}">
		    			<a href="<%=path %>/stuInfoController/stuInfosPage.do?currentPage=${pb.currentPage-1}">上一页 </a>&nbsp;&nbsp;
		    		</c:if>	
		    		
		    		<c:if test="${pb.currentPage==pb.totalPage}">
		    			下一页&nbsp;&nbsp;
		    		</c:if>
		    		<c:if test="${pb.currentPage!=pb.totalPage}">
		    			<a href="<%=path %>/stuInfoController/stuInfosPage.do?currentPage=${pb.currentPage+1}">下一页 </a>&nbsp;&nbsp;
		    		</c:if>	
		    		
		    		<a href="<%=path %>/stuInfoController/stuInfosPage.do?currentPage=${pb.totalPage}">尾页</a>&nbsp;&nbsp;
		    		
		    		总页数:${pb.totalPage}&nbsp;&nbsp;
		    		总数:${pb.count}&nbsp;&nbsp;
	    		</td>
	    	</tr>
	    	
	    </table>
	    
	    
	    
  </body>
</html>
