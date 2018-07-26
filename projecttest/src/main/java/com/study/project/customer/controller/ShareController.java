package com.study.project.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/share")
public class ShareController {
	
	
	
		
		@RequestMapping(value="sharelist" , method=RequestMethod.GET)   // ���� �������� ����Ʈ
		public String shareList() {
			
			return "share/sharelist";
		}

		
		@RequestMapping(value="shareview" , method=RequestMethod.GET)  // ���� �������� ����
		public String shareView() {
			
			return "share/shareview";
		}
		
		@RequestMapping(value="shareview" , method=RequestMethod.POST) // �������� ����
		public String shareView(String e) {
			
			return "share/sharelist";
		}
		
		@RequestMapping(value="sharewrite" , method=RequestMethod.GET) // ���� �������� ����
		public String shareWrite() {
			
			return "share/sharewrite";
		}
		
		@RequestMapping(value="sharewrite" , method=RequestMethod.POST) // �������� ����
		public String shareWrite(String e) {
			
			return "share/shareview";
		}
		
		@RequestMapping(value="sharemodify" , method=RequestMethod.GET)  // ���� �������� ����
		public String shareModify() {
			
			return "share/sharemodify";
		}
		
		@RequestMapping(value="sharemodify" , method=RequestMethod.POST) // �������� ����
		public String shareModify(String e) {
			
			return "share/shareview";
		}
		
		@RequestMapping(value="sharedelete" , method=RequestMethod.GET) // �������� ����  
		public String shareDelete(String e) {
			
			return "share/sharelist";
		}

}
