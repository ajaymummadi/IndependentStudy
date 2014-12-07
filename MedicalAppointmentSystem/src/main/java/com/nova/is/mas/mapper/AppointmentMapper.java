package com.nova.is.mas.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.nova.is.mas.model.AppointmentDO;
import com.nova.is.mas.model.PatientDetailsDO;

public class AppointmentMapper implements RowMapper {

	public AppointmentDO mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		
		AppointmentDO appointmentDO = new AppointmentDO();
		int pId = resultSet.getInt("patient_id");
		String lastName = resultSet.getString("last_name");
		String firstName = resultSet.getString("first_name");
		String sex = resultSet.getString("sex");
		
		String maritalStatus = resultSet.getString("marital_status");
		String address = resultSet.getString("address");
		String city = resultSet.getString("city");
		String state = resultSet.getString("state");
		int zipcode = resultSet.getInt("zipcode");
		String phoneNumber = resultSet.getString("phone_number");
		String insuranceProvider = resultSet.getString("insurance_provider");
		int height = resultSet.getInt("height");
		int weight = resultSet.getInt("weight");		
		String allergies = resultSet.getString("allergies");
		PatientDetailsDO patientDetailsDO = new PatientDetailsDO();
		patientDetailsDO.setpId(pId);
		patientDetailsDO.setLastName(lastName);
		patientDetailsDO.setFirstName(firstName);
		patientDetailsDO.setSex(sex);
		
		patientDetailsDO.setMaritalStatus(maritalStatus);
		patientDetailsDO.setAddress(address);
		patientDetailsDO.setCity(city);
		patientDetailsDO.setState(state);
		patientDetailsDO.setZipcode(zipcode);
		patientDetailsDO.setPhoneNumber(phoneNumber);
		patientDetailsDO.setInsuranceProvider(insuranceProvider);
		patientDetailsDO.setHeight(height);
		patientDetailsDO.setWeight(weight);		
		patientDetailsDO.setAllergies(allergies);
        List<Object> objList = new ArrayList<Object>(); 	
		Date date = resultSet.getDate("date");
		appointmentDO.setPatientDetailsDO(patientDetailsDO);
		appointmentDO.setDate(date);	
		return appointmentDO;
	}
}
