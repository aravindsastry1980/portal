package com.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DashboardController {
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView admin(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin");
		return mav;
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ModelAndView user(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		return mav;
	}
}
