package com.nova.is.mas.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.nova.is.mas.model.PatientDetailsDO;

public class PatientDetailsRowMapper implements RowMapper {

	public PatientDetailsDO mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		
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
		PatientDetailsDO projectDetailsDO = new PatientDetailsDO();
		projectDetailsDO.setpId(pId);
		projectDetailsDO.setLastName(lastName);
		projectDetailsDO.setFirstName(firstName);
		projectDetailsDO.setSex(sex);
		projectDetailsDO.setMaritalStatus(maritalStatus);
		projectDetailsDO.setAddress(address);
		projectDetailsDO.setCity(city);
		projectDetailsDO.setState(state);
		projectDetailsDO.setZipcode(zipcode);
		projectDetailsDO.setPhoneNumber(phoneNumber);
		projectDetailsDO.setInsuranceProvider(insuranceProvider);
		projectDetailsDO.setHeight(height);
		projectDetailsDO.setWeight(weight);		
		projectDetailsDO.setAllergies(allergies);
		return projectDetailsDO;
	}

}
