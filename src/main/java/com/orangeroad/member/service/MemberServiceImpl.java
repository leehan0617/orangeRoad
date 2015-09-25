package com.orangeroad.member.service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.orangeroad.member.dao.MemberDao;
import com.orangeroad.member.dto.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao dao;
	
	/**
	 * @함수명:sign
	 * @작성일:2015. 9. 26.
	 * @작성자:이한빈 
	 * @설명문:회원가입 처리 ###생일은 Front에서 다시 처리해야함####
	 */
	@Override
	public void sign(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		Member member = (Member) map.get("member");
		member.setRegisterDate(new Date());
		System.out.println("생일 처리 Front에서 변경해야함");
		member.setBirth(new Date());
		dao.sign(member);
	}

}
