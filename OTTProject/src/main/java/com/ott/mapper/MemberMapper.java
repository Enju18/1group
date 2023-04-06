package com.ott.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ott.dto.AdminDTO;
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
	
}
