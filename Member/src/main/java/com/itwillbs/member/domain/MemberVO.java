package com.itwillbs.member.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberVO {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String birthday;
	private Timestamp regdate;
	private Timestamp updatedate;
	
}
