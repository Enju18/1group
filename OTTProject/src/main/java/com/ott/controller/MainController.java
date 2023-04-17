package com.ott.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("")
	public String main() {
		return "main";
	}
	@RequestMapping("/search/tag/view")
	public String searchTagView() {
		
		return "";
	}
	@RequestMapping("/week/content/view")
	public String weekContentView() {
		
		return "all_content";
	}
	@RequestMapping("/recommend/theme/view")
	public String recommentThemeView() {
		
		return "Member_Theme_Recommendation";
	}
	@RequestMapping("/membership/view")
	public String membershipView() {
		
		return "";
	}
}