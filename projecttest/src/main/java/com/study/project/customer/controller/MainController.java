package com.study.project.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MainController {

	
	@RequestMapping(value="main" , method=RequestMethod.GET)  //무브 메인
	public String main() {
		
		return "main";
	}
}
