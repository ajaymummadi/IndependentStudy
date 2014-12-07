package com.nova.is.mas.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nova.is.mas.model.LoginDO;
import com.nova.is.mas.services.ResourceServices;
public class ResourceController extends MultiActionController {
	
	public ResourceServices resourceServices;
	
	public LoginDO loginDO; 

	public void setResourceServices(ResourceServices resourceServices) {
		this.resourceServices = resourceServices;
	}

	
	
	public ModelAndView validateUser(HttpServletRequest request, 
			HttpServletResponse response, LoginDO loginDO) throws Exception {
		int numberOfRows = 0;
		ModelAndView modelAndView = new ModelAndView();
		HttpSession sess = (HttpSession)request.getSession(false);
		loginDO = resourceServices.validateUser(loginDO);
		modelAndView.setViewName("index");
		modelAndView.addObject("role", loginDO.getRole());
		modelAndView.addObject("userName", loginDO.getUserName());		
		return modelAndView;
		
	}
	
	
		
	}
	
