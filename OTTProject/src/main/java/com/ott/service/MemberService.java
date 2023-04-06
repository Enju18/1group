package com.ott.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ott.dto.AdminDTO;
import com.ott.dto.MemberDTO;
import com.ott.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mapper;
	
	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}

	public MemberDTO login(String eamil, String passwd) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("eamil", eamil);
		map.put("passwd", passwd);
		return mapper.login(map);
	}

	public AdminDTO adminLogin(String id, String passwd) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("passwd", passwd);
		return mapper.adminLogin(map);
	}


	
	
}




