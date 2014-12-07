package com.nova.is.mas.dao;

import java.util.List;

import com.nova.is.mas.model.AppointmentDO;
import com.nova.is.mas.model.PatientDetailsDO;
import com.nova.is.mas.model.PhysicianDO;

public interface PatientDAO {

	public void addPatient(PatientDetailsDO proj);
	public List<PatientDetailsDO> getPatientList();
	public PatientDetailsDO getPatientList(PatientDetailsDO patientDetails);
	public void scheduleAppointment(PatientDetailsDO projDetail);
	public List<PhysicianDO> getPhysicians();
	public PatientDetailsDO getPatientName(int pId);
	public void saveSchedule(String physicianID, String patientID,
			String appointmentType, String day, String date);
	public List<AppointmentDO> getAppointments(String userName);
	public List<PatientDetailsDO> getPatientInfo(int pId);
	public List<PatientDetailsDO> getPatientInfo(String firstName, String lastName);
	
}
