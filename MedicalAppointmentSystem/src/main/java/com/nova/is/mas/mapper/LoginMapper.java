package com.nova.is.mas.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.Entity;

import org.springframework.jdbc.core.RowMapper;

import com.nova.is.mas.model.LoginDO;
@Entity
public class LoginMapper implements RowMapper {

	public LoginDO mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		
		String role = resultSet.getString("role");
		LoginDO loginDO = new LoginDO();
		loginDO.setRole(role);
		return loginDO;
	}

}
