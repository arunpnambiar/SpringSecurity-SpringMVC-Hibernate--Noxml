package com.schoolerp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@RequestMapping("/users")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	@RequestMapping("/view")
	public ModelAndView view() {
		
		/*List<Users> students=service.getAllStudent();*/
		return new ModelAndView("Listusers");
	}
	@GetMapping("/login")
	public ModelAndView CustomLoginController()
	{
		return new ModelAndView( "CustomLogin");
	}
}
