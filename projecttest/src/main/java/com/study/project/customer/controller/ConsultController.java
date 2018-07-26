package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/consult")
public class ConsultController {
	
	@RequestMapping(value="consultlist" , method=RequestMethod.GET)   // ���� 1��1 ��� ����Ʈ
	public String consultList() {
		
		return "consult/consultlist";
	}

	
	@RequestMapping(value="consultview" , method=RequestMethod.GET)  // ���� 1��1 ��� ����
	public String consultView() {
		
		return "consult/consultview";
	}
	
	@RequestMapping(value="consultview" , method=RequestMethod.POST) // 1��1 ��� ����
	public String consultView(String e) {
		
		return "consult/consultlist";
	}
	
	@RequestMapping(value="consultwrite" , method=RequestMethod.GET) // ���� 1��1 ��� ����
	public String consultWrite() {
		
		return "consult/consultwrite";
	}
	
	@RequestMapping(value="consultwrite" , method=RequestMethod.POST) // 1��1 ��� ����
	public String consultWrite(String e) {
		
		return "consult/consultview";
	}
	
	@RequestMapping(value="consultmodify" , method=RequestMethod.GET)  //���� 1��1 ��� ����
	public String consultModify() {
		
		return "consult/consultmodify";
	}
	
	@RequestMapping(value="consultmodify" , method=RequestMethod.POST) //1��1 ��� ����
	public String consultModify(String e) {
		
		return "consult/consultview";
	}
	
	@RequestMapping(value="consultDelete" , method=RequestMethod.GET) // 1��1 ��� ��� 
	public String consultDelete(String e) {
		
		return "consult/consultlist";
	}
	
	

}
