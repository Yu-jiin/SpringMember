package com.itwillbs.member.service;

import com.itwillbs.member.domain.MemberVO;

public interface MemberService {
	
	public String getTime();
	
	public void memberJoin(MemberVO vo);
	
	// 로그인
	public MemberVO memberLogin(MemberVO vo);
	
	
	
	
	
	
	
	
	
	
	
}
