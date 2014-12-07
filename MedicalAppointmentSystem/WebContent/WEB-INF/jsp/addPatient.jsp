<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
 		 function validate()
		{
		var ab=document.addProject;
			if(ab.pId.value=="")
			{
			alert("PID cannot be blank!");
			return false;
			}
			if(ab.firstName.value=="")
			{
			alert("First Name cannot be blank!");
			return false;
			}
			if(ab.lastName.value=="")
			{
			alert("Last Name cannot be blank");
			return false;
			}
			if(isNaN(ab.pId.value))
			{	
			alert("PID should be Numeric");
			return false;
			}
			if(ab.sex.value=="")
			{
			alert("sex cannot be blank");
			return false;
			}
			
			if(ab.insuranceProvider.value=="")
			{
			alert("please select Insurance Provider!");
			return false;
			}
		return true;	
		}

		</script>
<style type="text/css">
body{background-image:url("E:\Downloads\TarzanBookStore\webpages\search.jpg")};
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Patient</title>
</head>
<body bgcolor="white">
<center><h3 style="color:black">Add Patient</h3></center>
<form method = "post" name = "addproject" onsubmit="return validate();" action = '<c:url value="/savePatient.htm"/>'>

<center>
<table align=center cellspacing="15" >
<tr>
	<td>PID</td>
	<td><input type="text" name="pId" maxlength=6 /></td>
</tr>
<tr>
	<td>Last Name</td>
	<td><input type="text" name="lastName" /></td>
</tr>
<tr>
	<td>First Name</td>
	<td><input type="text" name="firstName" /></td>
</tr>

<tr>
	<td>Sex</td>
	<td><input type="text" name="sex" /></td>
</tr>

<tr>
	<td>Marital Status</td>
	<td><input type="text" name="maritalStatus" size="1"/></td>
</tr>
<tr>
	<td>Height</td>
	<td><input type="text" name="height" /></td>
</tr>

<tr>
	<td>Weight</td>
	<td><input type="text" name="weight" /></td>
</tr>

<tr>
	<td>Allergies</td>
	<td><input type="text" name="allergies" /></td>
</tr>
<tr>
	<td>Address</td>
	<td><input type="text" name="address" /></td>
</tr>

<tr>
	<td>City</td>
	<td><input type="text" name="city" /></td>
</tr>

<tr>
	<td>State</td>
	<td><input type="text" name="state" /></td>
</tr>

<tr>
	<td>Zipcode</td>
	<td><input type="text" name="zipcode" /></td>
</tr>

<tr>
	<td>Phone Number</td>
	<td><input type="text" name="phoneNumber" /></td>
</tr>

<tr>
	<td>Insurance Provider</td>
	<td><input type="text" name="insuranceProvider" /></td>
</tr>


<tr>
	<td><input type="submit" value="Add Patient"></input></td>
	<td><input type=reset value=Clear></input></td>
</tr>
</table>
</center>
</form>
</html>

