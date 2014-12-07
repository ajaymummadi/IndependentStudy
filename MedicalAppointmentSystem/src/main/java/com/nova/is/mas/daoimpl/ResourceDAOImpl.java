package com.nova.is.mas.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nova.is.mas.dao.ResourceDAO;
import com.nova.is.mas.mapper.LoginMapper;
import com.nova.is.mas.model.LoginDO;
public class ResourceDAOImpl implements ResourceDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

public LoginDO validateUser(LoginDO loginDO) {
		LoginMapper loginMapper = new LoginMapper();
		
		String role = "";
		String query = "select role from login where username = '"+loginDO.getUserName()+"' and password = '"+loginDO.getPassword()+"'";
		loginDO = (LoginDO)jdbcTemplate.queryForObject(query, loginMapper);
		return loginDO;
	}

}
