package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/consult")
public class ConsultController {
	
	@RequestMapping(value="consultlist" , method=RequestMethod.GET)   // 무브 1대1 상담 리스트
	public String consultList() {
		
		return "consult/consultlist";
	}

	
	@RequestMapping(value="consultview" , method=RequestMethod.GET)  // 무브 1대1 상담 보기
	public String consultView() {
		
		return "consult/consultview";
	}
	
	@RequestMapping(value="consultview" , method=RequestMethod.POST) // 1대1 상담 보기
	public String consultView(String e) {
		
		return "consult/consultlist";
	}
	
	@RequestMapping(value="consultwrite" , method=RequestMethod.GET) // 무브 1대1 상담 쓰기
	public String consultWrite() {
		
		return "consult/consultwrite";
	}
	
	@RequestMapping(value="consultwrite" , method=RequestMethod.POST) // 1대1 상담 쓰기
	public String consultWrite(String e) {
		
		return "consult/consultview";
	}
	
	@RequestMapping(value="consultmodify" , method=RequestMethod.GET)  //무브 1대1 상담 수정
	public String consultModify() {
		
		return "consult/consultmodify";
	}
	
	@RequestMapping(value="consultmodify" , method=RequestMethod.POST) //1대1 상담 수정
	public String consultModify(String e) {
		
		return "consult/consultview";
	}
	
	@RequestMapping(value="consultDelete" , method=RequestMethod.GET) // 1대1 상담 취소 
	public String consultDelete(String e) {
		
		return "consult/consultlist";
	}
	
	

}
