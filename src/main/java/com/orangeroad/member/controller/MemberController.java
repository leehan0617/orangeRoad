package com.orangeroad.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orangeroad.member.dto.Member;
import com.orangeroad.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	/**
	 * @함수명:goSignPage
	 * @작성일:2015. 9. 26.
	 * @작성자:이한빈 
	 * @설명문:회원가입페이지 이동
	 */
	@RequestMapping(value="/member/sign" , method=RequestMethod.GET)
	public String goSignPage(){
		return "/member/sign";
	}
	
	/**
	 * @함수명:signOk
	 * @작성일:2015. 9. 26.
	 * @작성자:이한빈 
	 * @설명문:회원가입처리
	 */
	@RequestMapping(value="/member/signOk" , method=RequestMethod.POST)
	public ModelAndView signOk(Member member){
		System.out.println("####signOk#####");
		ModelAndView mav = new ModelAndView();
		mav.addObject("member" , member);
		service.sign(mav);
		mav.setViewName("/member/signOk");
		return mav;
	}
}
