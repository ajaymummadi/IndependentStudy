package com.nova.is.mas.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nova.is.mas.model.PhysicianDO;

public class PhysicianMapper implements RowMapper {

	@Override
	public PhysicianDO mapRow(ResultSet resultSet, int arg1) throws SQLException {
		int physicianID = resultSet.getInt("doctorid");
		String lastName = resultSet.getString("lastname");
		String firstName = resultSet.getString("firstname");
		String specialization = resultSet.getString("specialization");
		int fee = resultSet.getInt("fee");
		long phoneNumber = resultSet.getInt("phone_number");
		PhysicianDO physicianDO = new PhysicianDO();
		physicianDO.setPhysicianID(physicianID);
		physicianDO.setLastName(lastName);
		physicianDO.setFirstName(firstName);
		physicianDO.setSpecialization(specialization);
		physicianDO.setFee(fee);
		physicianDO.setPhoneNumber(phoneNumber);
		return physicianDO;
	}

}
