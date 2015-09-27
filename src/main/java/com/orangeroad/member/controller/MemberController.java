package com.orangeroad.member.controller;

import javax.servlet.http.HttpServletRequest;

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
	 * @함수명:start
	 * @작성일:2015. 9. 27.
	 * @작성자:이한빈 
	 * @설명문:실행하면 맨 처음 나타나게하는 페이지
	 */
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String start(){
		return "start";
	}
	/**
	 * @함수명:goSignPage
	 * @작성일:2015. 9. 26.
	 * @작성자:이한빈 
	 * @설명문:회원가입페이지 이동
	 */
	@RequestMapping(value="/member/sign" , method=RequestMethod.GET)
	public String sign(){
		return "/member/sign";
	}
	
	/**
	 * @함수명:signOk
	 * @작성일:2015. 9. 26.
	 * @작성자:이한빈 
	 * @설명문:회원가입 승인
	 */
	@RequestMapping(value="/member/sign" , method=RequestMethod.POST)
	public ModelAndView sign(Member member){
		ModelAndView mav = new ModelAndView();
		mav.addObject("member" , member);
		service.sign(mav);
		mav.setViewName("/member/signOk");
		return mav;
	}
	
	/**
	 * @함수명:admin
	 * @작성일:2015. 9. 27.
	 * @작성자:이한빈 
	 * @설명문:관리자 페이지 이동
	 */
	@RequestMapping(value="/member/admin")
	public String admin(){
		return "/admin/admin";
	}
	
	/**
	 * @함수명:login
	 * @작성일:2015. 9. 27.
	 * @작성자:이한빈 
	 * @설명문:로그인 페이지 이동
	 */
	@RequestMapping(value="/member/login" , method=RequestMethod.GET)
	public String login(){
		return "/member/login";
	}
	
	/**
	 * 
	 * @함수명:login
	 * @작성일:2015. 9. 27.
	 * @작성자:이한빈 
	 * @설명문:로그인처리 기능
	 */
	@RequestMapping(value="/member/login" , method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.addObject("request" , request);
		service.login(mav);
		
		mav.setViewName("/member/loginOk");
		
		return mav;
	}
	
	@RequestMapping(value="/member/logout" , method=RequestMethod.GET)
	public String logout(){
		return "/member/logout";
	}
}
