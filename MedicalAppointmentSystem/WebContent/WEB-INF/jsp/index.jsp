<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>test page</title>
</head>
<body>

<%
// UserDO userDO = (UserDO)session.getAttribute("user");
 
 String role = (String)request.getAttribute("role");
if (role.equalsIgnoreCase("recep")) {
	response.sendRedirect("patientsum.htm");
} else {
	response.sendRedirect("patientsumForNormalUser.htm");
} 
	
%>

</body>