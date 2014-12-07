package com.nova.is.mas.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nova.is.mas.model.AppointmentDO;
import com.nova.is.mas.model.PatientDetailsDO;
import com.nova.is.mas.model.PhysicianDO;
import com.nova.is.mas.services.PatientServices;



public class PatientController extends MultiActionController{

	private PatientDetailsDO patientDetailsDO;
	private PhysicianDO physicianDo;
	private PatientServices patientServices;  
	
	
	public void setProjDetails(PatientDetailsDO patientDetailsDO) {
		this.patientDetailsDO = patientDetailsDO;
	}
	public void setPhysicianDetails(PhysicianDO physicianDO) {
		this.physicianDo = physicianDO;
	}	    

     public void setPatientServices(PatientServices patientServices) {  

        this.patientServices = patientServices;  

     } 


	public ModelAndView addPatient(HttpServletRequest request,
			HttpServletResponse response, PatientDetailsDO projDetail) throws Exception { 

		System.out.println("Add method called"); 
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addPatient");
		return modelAndView;

	}
	
	public ModelAndView savePatient(HttpServletRequest request,
			HttpServletResponse response, PatientDetailsDO patientDetail) throws Exception { 
		ModelAndView modelAndView = new ModelAndView();
		
		patientServices.addPatientService(patientDetail);
		modelAndView.setViewName("success");
		modelAndView.addObject("message", "Patient Addedd Successfully");
		return modelAndView;

	}
	 	
	public ModelAndView scheduleAppointment(HttpServletRequest request,
			HttpServletResponse response, PatientDetailsDO projDetail) throws Exception { 
		ModelAndView modelAndView = new ModelAndView();
		List<PhysicianDO> physicianList = new ArrayList<PhysicianDO>();
		int pId = Integer.parseInt(ServletRequestUtils.getRequiredStringParameter(request, "id"));	    
		projDetail.setpId(pId);
		physicianList= patientServices.getPhysicians();
		PatientDetailsDO patientDetailsDO = patientServices.getPatientName(pId);
		patientServices.scheduleAppointment(projDetail);
		modelAndView.setViewName("scheduleAppointment");
		modelAndView.addObject("physicianList", physicianList);
		modelAndView.addObject("pId", pId);
		modelAndView.addObject("patients", patientDetailsDO);
		return modelAndView;

	}
    
	public ModelAndView saveSchedule(HttpServletRequest request,
			HttpServletResponse response, PatientDetailsDO projDetail) throws Exception { 
		ModelAndView modelAndView = new ModelAndView();
		String physicianID = request.getParameter("physicianName");
		String patientID =  request.getParameter("patientID");
		String appointmentType =  request.getParameter("appointmenttype");
		String day = request.getParameter("day");
	    String date = request.getParameter("appintmentDate");
	    patientServices.saveSchedule(physicianID, patientID, appointmentType, day, date);
		modelAndView.setViewName("successAppointment");
		//modelAndView.addObject("physicianList", physicianList);
		//modelAndView.addObject("pId", pId);
		modelAndView.addObject("message","Appointment Scheduled Successfully");
		modelAndView.addObject("patients", patientDetailsDO);
		return modelAndView;

	}
	
	public ModelAndView patientsumForNormalUser(HttpServletRequest request,
			HttpServletResponse response, PatientDetailsDO projDetail) throws Exception { 
		ModelAndView modelAndView = new ModelAndView();
		String userName = (String) request.getAttribute("userName");
		List<AppointmentDO> appointmentList  = patientServices.getAppointments(userName);
		modelAndView.addObject("appointments", appointmentList);
		modelAndView.setViewName("patientsumForNormalUser");
		return modelAndView;

	}
	
	public ModelAndView displayPatientsInfo(HttpServletRequest request,
			HttpServletResponse response, PatientDetailsDO projDetail) throws Exception { 
		ModelAndView modelAndView = new ModelAndView();
		int pId = Integer.parseInt(ServletRequestUtils.getRequiredStringParameter(request, "id"));
		List<PatientDetailsDO> patientList = patientServices.getPatientInfo(pId);
		modelAndView.addObject("patient", patientList);
		modelAndView.setViewName("displayPatientsInfo");
		return modelAndView;

	}
	
	public ModelAndView searchPatient(HttpServletRequest request,
			HttpServletResponse response, PatientDetailsDO projDetail) throws Exception { 
		ModelAndView modelAndView = new ModelAndView();
		PatientDetailsDO patientDetailsDO = null;
		List<PatientDetailsDO> patientList = null;
		int pId = 0;
		if(request.getParameter("searchPatientID")!="") {
		pId = Integer.parseInt(request.getParameter("searchPatientID"));
		}
		String firstName = (String)request.getParameter("searchPatientFirstName");
		String lastName = (String)request.getParameter("searchPatientLastName");
		if(pId!=0) {
			patientList = patientServices.getPatientInfo(pId);
			modelAndView.addObject("patient", patientList);
		} else if (firstName != null && lastName != null) {
			patientList = patientServices.getPatientInfo(firstName, lastName);
			modelAndView.addObject("patients", patientList);
		}
		
		modelAndView.setViewName("displayPatientsInfo");
		return modelAndView;

	}

	



}
