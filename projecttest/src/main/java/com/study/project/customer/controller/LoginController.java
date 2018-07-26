package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	
	@RequestMapping(value="login" , method=RequestMethod.GET)  //무브 로그인
	public String login() {
		
		return "login/login";
	}
	
	@RequestMapping(value="login" , method=RequestMethod.POST)  // 로그인
	public String login(String e) {
		
		return "main";
	}
	
	
	

}
