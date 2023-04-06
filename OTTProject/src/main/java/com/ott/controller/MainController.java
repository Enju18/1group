package com.ott.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ott.service.MemberService;

@Controller
public class MainController {
	
	@RequestMapping("")
	public String main() {
		return "main";
	}

}















