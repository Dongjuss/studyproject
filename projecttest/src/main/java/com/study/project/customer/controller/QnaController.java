package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/qna")
public class QnaController {
	
	@RequestMapping(value="qnalist" , method=RequestMethod.GET)  // 무브 qna 리스트 
	public String qnaList() {
		
		return "qna/qnalist";
	}

	
	@RequestMapping(value="qnaview" , method=RequestMethod.GET) // 무브 qna 보기
	public String qnaView() {
		
		return "qna/qnaview";
	}
	
	@RequestMapping(value="qnaview" , method=RequestMethod.POST) // qna 보기
	public String qnaView(String e) {
		
		return "qna/qnalist";
	}
	
	@RequestMapping(value="qnawrite" , method=RequestMethod.GET) // 무브 qna 쓰기
	public String qnaWrite() {
		
		return "qna/qnawrite";
	}
	
	@RequestMapping(value="qnawrite" , method=RequestMethod.POST) // qna 쓰기
	public String qnaWrite(String e) {
		
		return "qna/qnaview";
	}
	
	@RequestMapping(value="qnamodify" , method=RequestMethod.GET) // 무브 qna 수정
	public String qnaModify() {
		
		return "qna/qnamodify";
	}
	
	@RequestMapping(value="qnamodify" , method=RequestMethod.POST) // qna 수정
	public String qnaModify(String e) {
		
		return "qna/qnaview";
	}
	
	@RequestMapping(value="qnadelete" , method=RequestMethod.GET)  // qna 삭제
	public String qnaDelete(String e) {
		
		return "qna/qnalist";
	}

}
