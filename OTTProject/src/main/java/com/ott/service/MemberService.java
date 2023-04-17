package com.ott.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties.Embedded;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.ott.dto.AdminDTO;
import com.ott.dto.FileDTO;
import com.ott.dto.InquiryAnswerDTO;
import com.ott.dto.InquiryDTO;
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

	public AdminDTO adminLogin(String email, String passwd) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", email);
		map.put("passwd", passwd);
		return mapper.adminLogin(map);
	}

	public int insertInquiry(MemberDTO dto, HttpSession session) {
		return mapper.insertInquiry(dto, session);
	}

	public List<MemberDTO> selectAllInquiry(HttpSession session) {
		return mapper.selectAllInquiry(session);
	}

	public List<InquiryDTO> selectInquiry(HttpSession session) {
		return mapper.selectInquiry(session);
	}

	public List<InquiryAnswerDTO> memberSearch(HttpSession session, String title) {
		return mapper.memberSearch(session, title);
	}

	public int updateMember(MemberDTO dto) {
		return mapper.updateMember(dto);
	}

	public List<FileDTO> selectFileList(HttpSession session) {
		return mapper.selectFileList(session);
	}

	public int updateNick(String nick, String email) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("email", email);
		map.put("nick", nick);
		return mapper.updateNick(map);
	}

	public int insertMember(MemberDTO dto) {
		return mapper.insertMember(dto);
	}

	public int updateEmail(String email, String aemail) {
		return mapper.updateEmail(email, aemail);
	}

	public int updatePasswd(String pwd, String email) {
		return mapper.updatePasswd(pwd, email);
	}

	public int deleteMember(String email) {
		return mapper.deleteMember(email);
	}

	


	

}




