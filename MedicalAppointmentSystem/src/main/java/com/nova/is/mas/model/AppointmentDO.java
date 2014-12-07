package com.nova.is.mas.model;

import java.util.Date;

public class AppointmentDO {

	PatientDetailsDO patientDetailsDO;
	Date date;
	public PatientDetailsDO getPatientDetailsDO() {
		return patientDetailsDO;
	}
	public void setPatientDetailsDO(PatientDetailsDO patientDetailsDO) {
		this.patientDetailsDO = patientDetailsDO;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
