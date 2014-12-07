package com.nova.is.mas.services;

import java.util.List;

import com.nova.is.mas.dao.PatientDAO;
import com.nova.is.mas.model.AppointmentDO;
import com.nova.is.mas.model.PatientDetailsDO;
import com.nova.is.mas.model.PhysicianDO;

public class PatientServices {
	
	private PatientDetailsDO patientDetails;
	private PatientDAO patientDAO;
	
	public PatientDAO getPatientDAO() {
		return patientDAO;
	}
	public void setPatientDAO(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}

	public List<PatientDetailsDO> getPatientList() {
		return patientDAO.getPatientList();
	}

	public void addPatientService(PatientDetailsDO patientDetails) {		
		patientDAO.addPatient(patientDetails);
		
	}

	public PatientDetailsDO getPatientList(PatientDetailsDO patientDetails) {
		return patientDAO.getPatientList(patientDetails);
		
	}
	public void scheduleAppointment(PatientDetailsDO projDetail) {
		patientDAO.scheduleAppointment(projDetail);
		
	}
	public List<PhysicianDO> getPhysicians() {
		return patientDAO.getPhysicians();
		
	}
	public PatientDetailsDO getPatientName(int pId) {
		// TODO Auto-generated method stub
		return patientDAO.getPatientName(pId);
	}
	public void saveSchedule(String physicianID, String patientID,
			String appointmentType, String day, String date) {
		patientDAO.saveSchedule(physicianID, patientID, appointmentType, day, date);
		
	}
	public List<AppointmentDO> getAppointments(String userName) {
		return patientDAO.getAppointments(userName);
		
	}
	public List<PatientDetailsDO> getPatientInfo(int pId) {
		return patientDAO.getPatientInfo(pId);
	}
	public List<PatientDetailsDO> getPatientInfo(String firstName, String lastName) {
		return patientDAO.getPatientInfo(firstName, lastName);
	}
}	


