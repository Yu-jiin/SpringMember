package com.itwillbs.member;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.member.service.MemberService;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {

	@Inject
	private MemberService mService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	
	// http://localhost:8088/member/memberjoin
	@RequestMapping(value = "/memberjoin", method = RequestMethod.GET)
	public void memberJoinGET() {
		logger.debug(" memberJoinGET() 실행 ");
	}
	
	

}
