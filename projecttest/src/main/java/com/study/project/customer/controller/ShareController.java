package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/share")
public class ShareController {
	
	
	
		
		@RequestMapping(value="sharelist" , method=RequestMethod.GET)   // 무브 나눔장터 리스트
		public String shareList() {
			
			return "share/sharelist";
		}

		
		@RequestMapping(value="shareview" , method=RequestMethod.GET)  // 무브 나눔장터 보기
		public String shareView() {
			
			return "share/shareview";
		}
		
		@RequestMapping(value="shareview" , method=RequestMethod.POST) // 나눔장터 보기
		public String shareView(String e) {
			
			return "share/sharelist";
		}
		
		@RequestMapping(value="sharewrite" , method=RequestMethod.GET) // 무브 나눔장터 쓰기
		public String shareWrite() {
			
			return "share/sharewrite";
		}
		
		@RequestMapping(value="sharewrite" , method=RequestMethod.POST) // 나눔장터 쓰기
		public String shareWrite(String e) {
			
			return "share/shareview";
		}
		
		@RequestMapping(value="sharemodify" , method=RequestMethod.GET)  // 무브 나눔장터 수정
		public String shareModify() {
			
			return "share/sharemodify";
		}
		
		@RequestMapping(value="sharemodify" , method=RequestMethod.POST) // 나눔장터 수정
		public String shareModify(String e) {
			
			return "share/shareview";
		}
		
		@RequestMapping(value="sharedelete" , method=RequestMethod.GET) // 나눔장터 삭제  
		public String shareDelete(String e) {
			
			return "share/sharelist";
		}

}
