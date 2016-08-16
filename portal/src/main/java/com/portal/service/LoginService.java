package com.portal.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.dao.LoginDAO;
import com.portal.model.UserBean;

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;
	
	@Transactional
	public boolean validateUser(UserBean bean){
		return loginDAO.validateUser(bean);
	}
}
