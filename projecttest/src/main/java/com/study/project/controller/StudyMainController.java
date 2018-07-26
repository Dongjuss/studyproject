package com.study.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagemove")
public class StudyMainController {
	


	@RequestMapping("/index.project")
	public String moveForm2() {
		System.out.println("HOME 컨트롤러");
		return "index";
	}
	
	@RequestMapping("/studycreate.project")
	public String moveForm3() {
		System.out.println("방생성 컨트롤러");
		return "studycreate";
	}
	@RequestMapping("/studycreatedetail.project")
	public String moveForm5() {
		System.out.println("방정보보기 컨트롤러");
		return "studycreatedetail";
	}
	
	
	@RequestMapping("/studylist.project")
	public String moveForm4() {
		System.out.println("방검색 컨트롤러");
		return "studylist";
	}
	
	@RequestMapping("/studycreate2.project")
	public String moveForm10() {
		System.out.println("방생성 컨트롤러");
		return "studycreate2";
	}
	
	@RequestMapping("/mypage.project")
	public String mypageForm() {
		System.out.println("마이페이지 컨트롤러");
		return "myapplylist";
	}
	@RequestMapping("/mylistpage.project")
	public String mypageForm2() {
		System.out.println("마이페이지 컨트롤러");
		return "mylist";
	}
	@RequestMapping("/mycreatepage.project")
	public String mypageForm3() {
		System.out.println("마이페이지 컨트롤러");
		return "mycreatelist";
	}	
	@RequestMapping("/mycounseling.project")
	public String mypageForm4() {
		System.out.println("1:1상담 컨트롤러");
		return "counseling";
	}	
	@RequestMapping("/mycounselingwrite.project")
	public String mypageForm5() {
		System.out.println("1:1상담 작성");
		return "counselingwrite";
	}	
	@RequestMapping("/mycounselingview.project")
	public String mypageForm6() {
		System.out.println("1:1상담 작성");
		return "counselingview";
	}	
}