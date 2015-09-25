package com.orangeroad.member.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	private String id;//아이디
	private String password;//비밀번호
	private String name;//이름
	private int age;//나이 
	private String address;//주소 
	private String mail;//메일
	private String mailing;//메일 수신여부
	private String phone;//전화번호
	private String gender;//성별 
	private Date birth;//생일
	private String grade;//회원등급 (ex : 운영자 , 개인 , 기업)
	private Date registerDate;//회원가입일
}