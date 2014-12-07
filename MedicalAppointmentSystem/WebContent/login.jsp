<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
 		 function validate()
		{
		var ab=document.login;
			if(ab.userName.value=="")
			{
			alert("userName cannot be blank!");
			return false;
			}
			if(ab.password.value=="")
			{
			alert("Password cannot be blank!");
			return false;
			}
			
		return true;	
		}

		</script>
<style type="text/css">
body{background-image:url("E:\Downloads\TarzanBookStore\webpages\search.jpg")};
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="login-box.css" rel="stylesheet" type="text/css" />
</head>
<body bgcolor="white">
<form method = "post" name = "login" onsubmit="return validate();" action = '<c:url value="/validateUser.htm"/>'>

<div style="padding: 100px 0 0 250px;">


<div id="login-box">
<H1>Medical Appointment System</H1>
<H1>Login</H1>
<br />
<br />
<div id="login-box-name" style="margin-top:20px;">UserName</div><div id="login-box-field" style="margin-top:20px;"><input name="userName" class="form-login" title="Username" value="" size="30" maxlength="2048" /></div>
<div id="login-box-name">Password:</div><div id="login-box-field"><input name="password" type="password" class="form-login" title="Password" value="" size="30" maxlength="2048" /></div>
<br />
<br />
<br />
<input id = "submitType" type="submit" value=""></input>
</div>
</div>
</form>
</html>

