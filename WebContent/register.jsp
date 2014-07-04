<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Page</title>

<script type="text/javascript">
</script>
</head>
<body>
<form action="${pageContext.request.contextPath}/profile/register.action" method="post">
<table>
	<tr>
		<td>E-mail ID:</td>
		<td><input type="text" name="profile.notesid" id="notesID" /></td>
		<td></td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><input type="text" name="profile.name" id="name" /></td>
		<td></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="profile.password" id="pwd" /></td>
		<td></td>
	</tr>
	<tr>
		<td>Password Confirm:</td>
		<td><input type="password" id="pwdCm" /></td>
		<td></td>
	</tr>
	<tr>
		<td>PeM:</td>
		<td>
			<select id="selectPeM" name="profile.pemid">
			<option value="1">Sun Yan Feng</option>
			<option value="2">Gu Jiang</option>
			<option value="3">Wu Yang</option>
			</select>
		</td>
		<td></td>
	</tr>
	<tr>
		<td>IL:</td>
		<td><input type="text" name="profile.ilid" value="Sun Yan Feng" /></td>
		<td></td>
	</tr>
	<tr>
		<td>Technology Domain:</td>
		<td>
			<select id="techDomain" name="profile.techdomain">
			<option value="1">Web</option>
			<option value="2">MF</option>
			<option value="3">Mobile</option>
			<option value="4">Others</option>
			</select>
			<input type="text" name="profile.techother">
		</td>
		<td></td>
	</tr>
	<tr>
		<td>Current Utilization:</td>
		<td><input type="text" name="profile.utilization" /></td>
		<td></td>
	</tr>
	<tr>
		<td>Current Location:</td>
		<td><input type="text" name="profile.location" /></td>
		<td></td>
	</tr>
	<tr>
		<td>Is Working at Customer site:</td>
		<td><input type="checkbox" name="profile.onsiteflag"></td>
		<td></td>
	</tr>
	<tr>
		<td>Is OnBench:</td>
		<td><input type="checkbox" name="profile.onbenchflag"></td>
		<td></td>
	</tr>
	<tr>
		<td>Is Registered:<a target="_blank" href="https://w3-connections.ibm.com/communities/service/html/communityview?communityUuid=eebba8fa-fc09-4465-8916-5e4542c44951#fullpageWidgetId=Waa361913e535_42f1_8ef3_c6a090f53917&file=40c93b05-787e-440a-a1e9-214a97208f21">register guide</a></td>
		<td><input type="checkbox" name="profile.regiesteredflag"></td>
		<td></td>
	</tr>
	<tr>
		<td colspan="2"><s:fielderror cssStyle="color:red;"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Register" /></td>
		<td><input type="button" value="Back"></td>
		<td></td>
	</tr>
</table>
</form>
</body>
</html>