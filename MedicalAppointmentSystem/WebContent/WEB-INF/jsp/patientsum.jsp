<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<html>  
<head><title>Medical Appointment System</title></head>  
<center><h3 style="color:black">Medical Appointment System</h3></center>
<body>
<form method = "post" name = "searchPatient" action = '<c:url value="/searchPatient.htm"/>'>  
  <table width="80%" border="1" cellspacing="0" cellpadding="5">  
     <tr>  
        <th width="4%">PID</th>  
        <th width="15%">Last Name</th>  
        <th width="15%">First Name</th>
        <th width="15%">Sex</th>
        <th width="8%">Marital Status</th>  
        <th width="8%">City</th>
        <th width="25%">Insurance Provider</th>  
        <th width="10%">&nbsp;</th>  
     </tr>  

     <c:choose>  
        <c:when test="${patients != null}">
         <c:forEach var="patients" items="${patients}" varStatus="counter">  
          <tr>  
            <td>${patients.pId}</td>  
            <td>${patients.lastName}</td>  
            <td>${patients.firstName}</td>
            <td>${patients.sex}</td>
			<td>${patients.maritalStatus}</td>
            <td>${patients.city}</td>
            <td>${patients.insuranceProvider}</td>
            <td><div align="center"> 
         	 <a href="schedule.htm?id=${patients.pId}">Schedule Appointment</a>       	 
         	 </div>  
            </td>
         </tr>  
      </c:forEach>    
      
    </c:when>  
    </c:choose>  
   </table>
   <table>
    	<tr>
    	    <b><i>&nbsp&nbsp Note: Use Patient ID or First Name and Last Name </i></b>
    		<td>Patient ID: <input type="text" name="searchPatientID"></td>
    		<td>First Name: <input type="text" name="searchPatientFirstName"></td>
    		<td>Last Name : <input type="text" name="searchPatientLastName"></td>
        </tr>
        <tr>
           <td align="center"><input type="submit" value="search"/></td>
        </tr>
   </table>  
    <br/><br/>
   <a href="addPatient.htm?">Add Patient</a>


   </form>
   </body>  

 </html> 
