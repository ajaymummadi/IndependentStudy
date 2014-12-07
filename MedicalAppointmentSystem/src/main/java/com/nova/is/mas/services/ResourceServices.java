package com.nova.is.mas.services;

import com.nova.is.mas.dao.ResourceDAO;
import com.nova.is.mas.model.LoginDO;

public class ResourceServices {
	
	public ResourceDAO resourceDAO;

	public ResourceDAO getResourceDAO() {
		return resourceDAO;
	}

	public void setResourceDAO(ResourceDAO resourceDAO) {
		this.resourceDAO = resourceDAO;
	}


	public LoginDO validateUser(LoginDO loginDO) {
		return resourceDAO.validateUser(loginDO);
		
	}

}
