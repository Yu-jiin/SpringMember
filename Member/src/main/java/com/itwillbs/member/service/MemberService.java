package com.itwillbs.member.service;

import com.itwillbs.member.domain.MemberVO;

public interface MemberService {
	
	public String getTime();
	
	// 회원가입
	public void memberJoin(MemberVO vo);
	
	// 로그인
	public MemberVO memberLogin(MemberVO vo);
	
	// 회원정보 자기꺼 조회
	public MemberVO memberInfo(String id);
	
	// 회원정보 수정 
	public int memberUpdate(MemberVO vo);
	
	// 회원정보 삭제
	public int memberDelete(MemberVO vo);
	
	
	
	
}
