package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/qna")
public class QnaController {
	
	@RequestMapping(value="qnalist" , method=RequestMethod.GET)  // ���� qna ����Ʈ 
	public String qnaList() {
		
		return "qna/qnalist";
	}

	
	@RequestMapping(value="qnaview" , method=RequestMethod.GET) // ���� qna ����
	public String qnaView() {
		
		return "qna/qnaview";
	}
	
	@RequestMapping(value="qnaview" , method=RequestMethod.POST) // qna ����
	public String qnaView(String e) {
		
		return "qna/qnalist";
	}
	
	@RequestMapping(value="qnawrite" , method=RequestMethod.GET) // ���� qna ����
	public String qnaWrite() {
		
		return "qna/qnawrite";
	}
	
	@RequestMapping(value="qnawrite" , method=RequestMethod.POST) // qna ����
	public String qnaWrite(String e) {
		
		return "qna/qnaview";
	}
	
	@RequestMapping(value="qnamodify" , method=RequestMethod.GET) // ���� qna ����
	public String qnaModify() {
		
		return "qna/qnamodify";
	}
	
	@RequestMapping(value="qnamodify" , method=RequestMethod.POST) // qna ����
	public String qnaModify(String e) {
		
		return "qna/qnaview";
	}
	
	@RequestMapping(value="qnadelete" , method=RequestMethod.GET)  // qna ����
	public String qnaDelete(String e) {
		
		return "qna/qnalist";
	}

}
