package com.itwillbs.member.persistence;

import com.itwillbs.member.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	// 회원가입 처리
	public void insertMember(MemberVO vo);
	
	
	
	
}
