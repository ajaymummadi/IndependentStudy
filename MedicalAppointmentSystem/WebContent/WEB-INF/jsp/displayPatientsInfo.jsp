<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<html>  
<head><title>Medical Appointment System</title></head>  
<h3 style="color:black" align="center">Medical Appointment System</h3>
<body>  
  <table width="80%" border="0" cellspacing="0" cellpadding="5" align="center">
      <tr>
	      <td>
		       <c:choose>  
        		<c:when test="${patient != null}">
         			<c:forEach var="patient" items="${patient}" varStatus="counter">
         			 <tr>
				        <td>Last Name:</td> <td>${patient.firstName}</td>
				     </tr>
				     <tr>
				        <td>First Name:</td> <td>${patient.lastName}</td>
				     </tr>     
				        <tr>
				        <td>Sex:</td> <td>${patient.sex}</td>
				     
				        <tr>
				        <td>Height:</td> <td>${patient.height}</td>
				     </tr>
				        <tr>
				        <td>Weight:</td> <td>${patient.weight}</td>
				     </tr>
				        <tr>
				        <td>City:</td> <td>${patient.city}</td>
				     </tr>
				        <tr>
				        <td>Allergies:</td> <td>${patient.allergies}</td>
				     </tr>
				        <tr>
				        <td>Insurance Provider:</td> <td>${patient.insuranceProvider}</td>
				     </tr>
				     </c:forEach>
				  </c:when>
				 </c:choose> 
	      </td> 
      </tr>   
   </table>  
    <br/><br/>
   </body>  

 </html> 
