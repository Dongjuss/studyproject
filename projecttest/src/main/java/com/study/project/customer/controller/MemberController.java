package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@RequestMapping(value="memberview" , method=RequestMethod.GET) //  무브 개인정보 뷰
	public String memberView() {
		
		return "member/memberview";
	}
	
	@RequestMapping(value="membermodify" , method=RequestMethod.GET)  //  무브 회원 수정
	public String memberModify() {
		
		return "member/membermodify";
	}
	
	@RequestMapping(value="membermodify" , method=RequestMethod.POST)  // 회원 수정
	public String memberModify(String e) {
		
		return "member/memberview";
	}
	
	@RequestMapping(value="memberdelete" , method=RequestMethod.GET)  // 회원 탈퇴
	public String memberDelete() {
		
		return "main";
	}
	
	@RequestMapping(value="memberregister" , method=RequestMethod.GET)  // 무브 회원가입
	public String memberRegister() {
		
		return "member/memberregister";
	}
	
	
	@RequestMapping(value="memberregister" , method=RequestMethod.POST) // 회원가입
	public String memberRegister(String e) {
		
		return "login/login";
	}

}
