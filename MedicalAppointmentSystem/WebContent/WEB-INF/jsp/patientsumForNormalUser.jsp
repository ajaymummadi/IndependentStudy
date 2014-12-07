<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<html>  
<head><title>Medical Appointment System</title></head>  
<h3 style="color:black" align="center">Medical Appointment System</h3>
<body>  
  <table width="80%" border="1" cellspacing="0" cellpadding="5" align="center">  
     <tr>  
        <th width="20%">Last Name</th>  
        <th width="20%">First Name</th>  
        <th width="20%">City</th>
        <th width="20%">Phone Number</th>
        <th width="10%">Insurance Provider</th>
        <th width="10%">Date</th>  
          
     </tr>  

     <c:choose>  
        <c:when test="${appointments != null}">
         <c:forEach var="patients" items="${appointments}" varStatus="counter">  
          <tr>
            <td align="center"><a href="displayPatientsInfo.htm?id=${patients.patientDetailsDO.pId}">${patients.patientDetailsDO.lastName}</a></td>  
            <td align="center">${patients.patientDetailsDO.firstName}</td>
            <td align="center">${patients.patientDetailsDO.city}</td>
            <td align="center">${patients.patientDetailsDO.phoneNumber}</td>			
            <td align="center">${patients.patientDetailsDO.insuranceProvider}</td>
            <td align="center">${patients.date}</td>
            
         </tr>  
      </c:forEach>    
      
    </c:when>  
    </c:choose>  
   </table>  
    <br/><br/>
   </body>  

 </html> 
