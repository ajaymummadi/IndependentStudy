package com.nova.is.mas.controller;

import org.springframework.web.servlet.mvc.AbstractController;  
import org.springframework.web.servlet.ModelAndView;  

import com.nova.is.mas.model.PatientDetailsDO;
import com.nova.is.mas.services.PatientServices;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import java.util.ArrayList;
import java.util.List;  


public class PatientSumController extends AbstractController {  

	private PatientServices patientServices;  


	public void setPatientServices(PatientServices patientServices) {  
		this.patientServices = patientServices;  
	}  


	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {  


		List<PatientDetailsDO> patientDetialsList =   new ArrayList<PatientDetailsDO>();
		patientDetialsList = patientServices.getPatientList();
		
		
		//this.projService.listAll();  
		return new ModelAndView("patientsum", "patients", patientDetialsList);  

	} 

} 
