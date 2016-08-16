package com.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.portal.model.UserBean;
import com.portal.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView validateUser(@RequestParam("userID") String userID,@RequestParam("password") String password){
		UserBean bean = new UserBean();
		bean.setUserID(userID);
		bean.setPassword(password);
		boolean valid = loginService.validateUser(bean);
		
		ModelAndView mav = new ModelAndView();
		if(valid){
			mav.addObject("userName", "Tester");
			mav.setViewName("welcome");
		}
		else{
			mav.addObject("message", "Invalid Login");
			mav.setViewName("../../index");
		}
		
		return mav;
	}
}
