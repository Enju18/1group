package com.ott.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ott.dto.AdminDTO;
import com.ott.dto.MemberDTO;
import com.ott.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	private MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@RequestMapping("/login/view")
	public String loginView() {

		return "login";
	}

	@PostMapping("/login")
	public String login(HttpSession session, String email, String passwd,String id, HttpServletResponse response)
			throws Exception {
		MemberDTO dto = memberService.login(email, passwd);
		AdminDTO addto = memberService.adminLogin(id, passwd);
		if (dto != null) {
			session.setAttribute("dto", dto);
		}
		if (dto == null && addto != null) {
			session.setAttribute("addto", addto);
		}
		if (dto == null && addto == null) {
			response.setContentType("text/html; charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('아이디, 비밀번호를 확인해주세요.'); history.back();</script>");
			out.flush();
		}
		return "redirect:/";
	}
	
	

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@RequestMapping("/theme/recommendation")
	public String theme() {
		return "redirect:/Member_Theme_Recommendation";
	}
	
	@RequestMapping("/memberAccount")
	public String memberAccount() {
		return "member_account";
	}
	
	@RequestMapping("/emailFind")
	public String memberAccountFindPW() {
		return "member_login_find_email";
	}
	
	@RequestMapping("/pwFind")
	public String memberAccountFindEmail() {
		return "member_login_find_PW";
	}
	
	@RequestMapping("/Certified")
	public String memberAccountPWCertified() {
		return "member_login_find_Certified";
	}
	
	@RequestMapping("/pay")
	public String memberPay() {
		return "pay_main";
	}
	
	
	@RequestMapping("/")
	public String memberSearch() {
		return "";
	}
	
	
	@RequestMapping("/")
	public String member() {
		return "";
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
