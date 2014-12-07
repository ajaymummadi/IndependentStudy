<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<html>  
<head><title>Schedule Appointment</title></head>
<center><h3 style="color:black">Schedule An Appointment</h3></center>  
<body>
<form method = "post" name = "saveSchedule" action = '<c:url value="/saveSchedule.htm"/>'>  
  <table width="50%" border="1" cellspacing="0" cellpadding="5" align="center">  
     <tr>
        <td align="center">
        <b>Patient:</b> <input type="text" name="patientName" value="${patients.lastName}, ${patients.firstName}" readonly>
        </td>
        <td align="center">
        <b>Doctor:</b> <select name="physicianName">
          <option value="">Physician</option> 
          <c:choose>
            <c:when test="${physicianList != null}">
			 <c:forEach items="${physicianList}" var="physician">
			 <option value="${physician.physicianID}">${physician.lastName}, ${physician.firstName}</option>
			</c:forEach>
			</c:when>
		   </c:choose>	     
        </select>
        </td>  
     </tr>
     <input type="hidden" name="patientID" value="${patients.pId}" />
     <tr>
         <td align="center">
          	<select name="appointmenttype">
          		<option>Appointment Type</option>
          		<option value="Routine Preventive Care">Routine Preventive Care</option>
          		<option value="Follow Up">Follow Up</option>
          		<option value="Urgent/Same Day Appointment">Urgent/Same Day Appointment</option>
          		<option value="Nurse Visit">Nurse Visit</option>
          		<option value="Second Opinion">Second Opinion</option>
          	</select>
         </td>
         <td align="center">
          	<select name="day">
          		<option>Day of Week</option>
          		<option value="monday">Mon</option>
          		<option value="tuesday">Tue</option>
          		<option value="wednesday">Wed</option>
          		<option value="thursday">Thur</option>
          		<option value="friday">Fri</option>
          		<option value="saturday">Sat</option>
          		<option value="sunday">Sun</option>
          	</select>
         </td>
     </tr>
     <tr>
     	<td align="center">
	     	<b>Date:</b><input type="text" name="appintmentDate"> 
     	</td>
     	<td align="center">
    	 	<b>Description of Symptoms:</b><br><textarea cols="40" rows="5" name="symptoms"></textarea>
     	</td>
     </tr>  
   </table>
   <table align="center">
   	<tr>
     	<td align="center"><input type="submit" value="Schedule Appointment"></input></td>
     </tr>
   </table>   
  </form>
    <br/><br/>
   </body>  

 </html> 
