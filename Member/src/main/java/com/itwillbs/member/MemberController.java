package com.itwillbs.member;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.member.domain.MemberVO;
import com.itwillbs.member.service.MemberService;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {

	@Inject
	private MemberService mService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	// 회원가입
	//http://localhost:8088/member/memberjoin
	@RequestMapping(value = "/memberjoin", method = RequestMethod.GET)
	public void memberJoinGET() {
		logger.debug(" memberJoinGET() 실행 ");
	}
	
	@RequestMapping(value = "/memberjoin", method = RequestMethod.POST)
	public String memberJoinPOST(MemberVO vo) {
		logger.debug(" memberJoinPOST() 실행 ");
		mService.memberJoin(vo);
		logger.debug(" 회원가입 성공 ! ");
		return "redirect:/member/login";
	}
	
	// 로그인
	//http://localhost:8088/member/login
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void memberLoginGET() {
		logger.debug(" memberLoginGET() 호출 ");
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	 public String memberLoginPOST(MemberVO vo, HttpSession session) {
		 logger.debug(" memberLoginPOST(MemberVO vo) 호출 ");
		 logger.debug(" 로그인 정보 vo : "+vo);
		 MemberVO resultVO = mService.memberLogin(vo);
		 String addr = "";
		 if(resultVO == null) {
			 logger.debug(" 로그인 실패 ");
			 addr = "/member/login";
		 } else {
			 logger.debug(" 로그인 성공 ");
			 // 로그인 성공한 사용자의 아이디 정보를 세션에 저장
			 session.setAttribute("id", resultVO.getUserid());
			 addr = "/member/main";
		 }
		 return "redirect:"+addr ;
	 }
	 
	// 메인 
	// http://localhost:8088/member/main
	@GetMapping(value = "/main")
	 public String memberMainGET() {
		 logger.debug(" memberMainGet() 실행 ");
		 return "/member/main";
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
