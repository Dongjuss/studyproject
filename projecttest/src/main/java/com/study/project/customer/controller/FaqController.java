package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/faq")
public class FaqController {
	
	@RequestMapping(value="faqlist" , method=RequestMethod.GET)   // ���� faq ����Ʈ
	public String faqList() {
		
		return "faq/faqlist";
	}

	
	@RequestMapping(value="faqview" , method=RequestMethod.GET)  // ���� faq ���� 
	public String faqView() {
		
		return "faq/faqview";
	}
	
	@RequestMapping(value="faqview" , method=RequestMethod.POST)  // faq ���� 
	public String faqView(String e) {
		
		return "faq/faqlist";
	}
	
	@RequestMapping(value="faqwrite" , method=RequestMethod.GET)   // ���� faq ����
	public String faqWrite() {
		
		return "faq/faqwrite";
	}
	
	
	@RequestMapping(value="faqwrite" , method=RequestMethod.POST) // faq ����
	public String faqWrite(String e) {
		
		return "faq/faqview";
	}
	
	@RequestMapping(value="faqmodify" , method=RequestMethod.GET)   // ���� faq �����ϱ�
	public String faqModify() {
		
		return "faq/faqmodify";
	}
	
	@RequestMapping(value="faqmodify" , method=RequestMethod.POST)   // faq �����ϱ�
	public String faqModify(String e) {
		
		return "faq/faqview";
	}
	
	@RequestMapping(value="faqdelete" , method=RequestMethod.GET)  // faq �����ϱ�
	public String faqDelete() {
		
		return "faq/faqlist";
	}

}
