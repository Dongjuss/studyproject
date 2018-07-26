package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@RequestMapping(value="memberview" , method=RequestMethod.GET) //  ���� �������� ��
	public String memberView() {
		
		return "member/memberview";
	}
	
	@RequestMapping(value="membermodify" , method=RequestMethod.GET)  //  ���� ȸ�� ����
	public String memberModify() {
		
		return "member/membermodify";
	}
	
	@RequestMapping(value="membermodify" , method=RequestMethod.POST)  // ȸ�� ����
	public String memberModify(String e) {
		
		return "member/memberview";
	}
	
	@RequestMapping(value="memberdelete" , method=RequestMethod.GET)  // ȸ�� Ż��
	public String memberDelete() {
		
		return "main";
	}
	
	@RequestMapping(value="memberregister" , method=RequestMethod.GET)  // ���� ȸ������
	public String memberRegister() {
		
		return "member/memberregister";
	}
	
	
	@RequestMapping(value="memberregister" , method=RequestMethod.POST) // ȸ������
	public String memberRegister(String e) {
		
		return "login/login";
	}

}
