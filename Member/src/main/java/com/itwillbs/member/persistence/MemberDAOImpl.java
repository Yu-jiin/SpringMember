package com.itwillbs.member.persistence;

import java.util.HashMap;
import java.util.Map;

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

	@Override
	public MemberVO loginMember(String userid, String userpw) {
		logger.debug(" loginMember(String userid, String userpw) 호출 ");
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		MemberVO resultVO = sqlSession.selectOne(NAMESPACE + "loginMember",paramMap);
		return resultVO;
	}

	@Override
	public MemberVO loginMember(MemberVO vo) {
		logger.debug(" loginMember(MemberVO vo) 실행 ");
		MemberVO resultVO = sqlSession.selectOne(NAMESPACE + "loginMember", vo);
		return resultVO;
	}

	@Override
	public MemberVO getMember(String userid) {
		logger.debug(" getMember 호출 ");
		return sqlSession.selectOne(NAMESPACE + "getMember", userid);
	}

	@Override
	public int updateMember(MemberVO uvo) {
		logger.debug(" updateMember(MemberVO vo) 실행 ");
		return sqlSession.update(NAMESPACE + "updateMember", uvo);
	}

	
}
