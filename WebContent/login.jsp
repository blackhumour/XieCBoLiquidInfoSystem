<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/profile/login.action" method="post">
<table>
	<tr>
		<td>E-mail ID:</td>
		<td><input type="text" name="notesid" /></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr>
		<td colspan="2"><s:fielderror cssStyle="color:red;"/></td>
	</tr>
	<tr align="center">
		<td><input type="submit" value="login" /></td>
		<td><input type="button" value="register" onclick="regclick()" /></td>
	</tr>
</table>
</form>
</body>
</html>