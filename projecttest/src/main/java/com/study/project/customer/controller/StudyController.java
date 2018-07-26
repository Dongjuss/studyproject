package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/study")
public class StudyController {
	
	@RequestMapping(value="studylist" , method=RequestMethod.GET)  // 公宏 傍何规 府胶飘
	public String studyList() {
		
		return "study/studylist";
	}
	
	@RequestMapping(value="studyview" , method=RequestMethod.GET) // 公宏 傍何规 焊扁
	public String studyView() {
		
		return "study/studyview";
	}
	
	@RequestMapping(value="studyview" , method=RequestMethod.POST)  // 傍何规 焊扁
	public String studyView(String e) {
		
		return "study/studylist";
	}
	
	@RequestMapping(value="studywrite" , method=RequestMethod.GET) // 公宏 傍何规 积己
	public String studyWrite() {
		
		return "study/studywrite";
	}
	
	@RequestMapping(value="studywrite" , method=RequestMethod.POST)  // 傍何规 积己
	public String studyWrite(String e) {
		
		return "study/studyview";
	}
	
	@RequestMapping(value="studymodify" , method=RequestMethod.GET)  // 公宏 傍何规 荐沥
	public String studyModify() {
		
		return "study/studymodify";
	}
	
	@RequestMapping(value="studymodify" , method=RequestMethod.POST)  // 傍何规 荐沥
	public String studyModify(String e) {
		
		return "study/studyview";
	}
	
	@RequestMapping(value="delete" , method=RequestMethod.GET) // 傍何规 昏力
	public String delete(String e) {
		
		return "study/studylist";
	}
	
	
	
	
	
	
	@RequestMapping(value="mystudylist" , method=RequestMethod.GET)  // 公宏 唱狼 傍何规 府胶飘 
	public String myStudyList(String e) {
		
		return "study/mystudylist";
	}
	


}
