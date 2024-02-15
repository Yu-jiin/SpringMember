package com.itwillbs.member.persistence;

import com.itwillbs.member.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	// 회원가입 
	public void insertMember(MemberVO vo);
	
	// 로그인
	public MemberVO loginMember(String userid, String userpw);
	public MemberVO loginMember(MemberVO vo);
	
	// 회원정보 자기꺼 조회
	public MemberVO getMember(String userid);
	
	// 회원정보 수정 동작
	public int updateMember(MemberVO uvo);
	
	
	
	
	
	
}
