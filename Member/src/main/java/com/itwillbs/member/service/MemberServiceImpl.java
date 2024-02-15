package com.itwillbs.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.member.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	private MemberDAO mdao;
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
