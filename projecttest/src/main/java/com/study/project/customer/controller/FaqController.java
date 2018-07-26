package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/faq")
public class FaqController {
	
	@RequestMapping(value="faqlist" , method=RequestMethod.GET)   // 무브 faq 리스트
	public String faqList() {
		
		return "faq/faqlist";
	}

	
	@RequestMapping(value="faqview" , method=RequestMethod.GET)  // 무브 faq 보기 
	public String faqView() {
		
		return "faq/faqview";
	}
	
	@RequestMapping(value="faqview" , method=RequestMethod.POST)  // faq 보기 
	public String faqView(String e) {
		
		return "faq/faqlist";
	}
	
	@RequestMapping(value="faqwrite" , method=RequestMethod.GET)   // 무브 faq 쓰기
	public String faqWrite() {
		
		return "faq/faqwrite";
	}
	
	
	@RequestMapping(value="faqwrite" , method=RequestMethod.POST) // faq 쓰기
	public String faqWrite(String e) {
		
		return "faq/faqview";
	}
	
	@RequestMapping(value="faqmodify" , method=RequestMethod.GET)   // 무브 faq 수정하기
	public String faqModify() {
		
		return "faq/faqmodify";
	}
	
	@RequestMapping(value="faqmodify" , method=RequestMethod.POST)   // faq 수정하기
	public String faqModify(String e) {
		
		return "faq/faqview";
	}
	
	@RequestMapping(value="faqdelete" , method=RequestMethod.GET)  // faq 삭제하기
	public String faqDelete() {
		
		return "faq/faqlist";
	}

}
