package com.study.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagemove")
public class StudyMainController {
	


	@RequestMapping("/index.project")
	public String moveForm2() {
		System.out.println("HOME ��Ʈ�ѷ�");
		return "index";
	}
	
	@RequestMapping("/studycreate.project")
	public String moveForm3() {
		System.out.println("����� ��Ʈ�ѷ�");
		return "studycreate";
	}
	@RequestMapping("/studycreatedetail.project")
	public String moveForm5() {
		System.out.println("���������� ��Ʈ�ѷ�");
		return "studycreatedetail";
	}
	
	
	@RequestMapping("/studylist.project")
	public String moveForm4() {
		System.out.println("��˻� ��Ʈ�ѷ�");
		return "studylist";
	}
	
	@RequestMapping("/studycreate2.project")
	public String moveForm10() {
		System.out.println("����� ��Ʈ�ѷ�");
		return "studycreate2";
	}
	
	@RequestMapping("/mypage.project")
	public String mypageForm() {
		System.out.println("���������� ��Ʈ�ѷ�");
		return "myapplylist";
	}
	@RequestMapping("/mylistpage.project")
	public String mypageForm2() {
		System.out.println("���������� ��Ʈ�ѷ�");
		return "mylist";
	}
	@RequestMapping("/mycreatepage.project")
	public String mypageForm3() {
		System.out.println("���������� ��Ʈ�ѷ�");
		return "mycreatelist";
	}	
	@RequestMapping("/mycounseling.project")
	public String mypageForm4() {
		System.out.println("1:1��� ��Ʈ�ѷ�");
		return "counseling";
	}	
	@RequestMapping("/mycounselingwrite.project")
	public String mypageForm5() {
		System.out.println("1:1��� �ۼ�");
		return "counselingwrite";
	}	
	@RequestMapping("/mycounselingview.project")
	public String mypageForm6() {
		System.out.println("1:1��� �ۼ�");
		return "counselingview";
	}	
}