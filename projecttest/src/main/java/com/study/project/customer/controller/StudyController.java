package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/study")
public class StudyController {
	
	@RequestMapping(value="studylist" , method=RequestMethod.GET)  // ���� ���ι� ����Ʈ
	public String studyList() {
		
		return "study/studylist";
	}
	
	@RequestMapping(value="studyview" , method=RequestMethod.GET) // ���� ���ι� ����
	public String studyView() {
		
		return "study/studyview";
	}
	
	@RequestMapping(value="studyview" , method=RequestMethod.POST)  // ���ι� ����
	public String studyView(String e) {
		
		return "study/studylist";
	}
	
	@RequestMapping(value="studywrite" , method=RequestMethod.GET) // ���� ���ι� ����
	public String studyWrite() {
		
		return "study/studywrite";
	}
	
	@RequestMapping(value="studywrite" , method=RequestMethod.POST)  // ���ι� ����
	public String studyWrite(String e) {
		
		return "study/studyview";
	}
	
	@RequestMapping(value="studymodify" , method=RequestMethod.GET)  // ���� ���ι� ����
	public String studyModify() {
		
		return "study/studymodify";
	}
	
	@RequestMapping(value="studymodify" , method=RequestMethod.POST)  // ���ι� ����
	public String studyModify(String e) {
		
		return "study/studyview";
	}
	
	@RequestMapping(value="delete" , method=RequestMethod.GET) // ���ι� ����
	public String delete(String e) {
		
		return "study/studylist";
	}
	
	
	
	
	
	
	@RequestMapping(value="mystudylist" , method=RequestMethod.GET)  // ���� ���� ���ι� ����Ʈ 
	public String myStudyList(String e) {
		
		return "study/mystudylist";
	}
	


}
