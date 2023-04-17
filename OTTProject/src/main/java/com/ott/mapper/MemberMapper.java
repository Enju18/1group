package com.ott.mapper;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;

import com.ott.dto.AdminDTO;
import com.ott.dto.FileDTO;
import com.ott.dto.InquiryAnswerDTO;
import com.ott.dto.InquiryDTO;
import com.ott.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	MemberDTO login(HashMap<String, Object> map);
	List<MemberDTO> selectAllMember();
	int insertMember(MemberDTO dto);
	int updateMember(MemberDTO dto);
	MemberDTO selectMember(String eamil);
	List<MemberDTO> searchMember(HashMap<String, Object> map);
	AdminDTO adminLogin(HashMap<String, Object> map);
	int insertInquiry(MemberDTO dto, HttpSession session);
	List<MemberDTO> selectAllInquiry(HttpSession session);
	List<InquiryDTO> selectInquiry(HttpSession session);
	List<InquiryAnswerDTO> memberSearch(HttpSession session, String title);
	List<FileDTO> selectFileList(HttpSession session);
	int updateNick(HashMap<String, Object> map);
	int updateEmail(String email, String aemail);
	int updatePasswd(String pwd, String email);
	int deleteMember(String email);
	
	
}
