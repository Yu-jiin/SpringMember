package com.itwillbs.member.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.member.domain.MemberVO;
import com.itwillbs.member.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Inject
	private MemberDAO mdao;
	
	@Override
	public String getTime() {
		return mdao.getTime();
	}

	@Override
	public void memberJoin(MemberVO vo) {
		logger.debug(" MemberJoin(MemberVO vo) 실행 ");
		mdao.insertMember(vo);
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		logger.debug(" memberLogin(MemberVO vo) 실행 ");
		MemberVO resultVO = mdao.loginMember(vo);
		logger.debug(" 로그인 처리 완료 ! ");
		return resultVO;
	}

	@Override
	public MemberVO memberInfo(String id) {
		logger.debug(" memberInfo(String userid) 실행 ");
		MemberVO resultVO = mdao.getMember(id);
		logger.debug(" 회원정보 조회 완료 ");
		return resultVO;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		logger.debug(" memberUpdate 실행 ");
		return mdao.updateMember(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		logger.debug(" memberDelete 실행 ");
		return mdao.deleteMember(vo);
	}

	
}
