package com.itwillbs.member.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.member.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	
	
	private static final Logger logger 
			= LoggerFactory.getLogger(MemberDAOImpl.class);
	
	private static final String NAMESPACE = "com.itwillbs.mapper.MemberMapper.";
	
	@Override
	public String getTime() {
		logger.debug(" getTime() 호출 ");
		String time = sqlSession.selectOne("com.itwillbs.mapper.MemberMapper.getTime");
		logger.debug(" DAOImpl >> " + time);
		return time;
	}

	@Override
	public void insertMember(MemberVO vo) {
		logger.debug(" insertMember() 호출 ");
		sqlSession.insert(NAMESPACE + "insertMember", vo); 
		logger.debug(" mysql insertMember 실행 완료 ");
	}

}
