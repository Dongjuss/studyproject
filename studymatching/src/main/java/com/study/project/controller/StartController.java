package com.study.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {
	@RequestMapping("/start.htm")
	public String moveForm() {
		System.out.println("컨트롤러 왔습니다.");
		return "index";
	}
}
