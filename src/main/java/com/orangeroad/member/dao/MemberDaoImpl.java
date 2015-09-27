package com.orangeroad.member.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orangeroad.member.dto.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	/**
	 * @함수명:sign
	 * @작성일:2015. 9. 26.
	 * @작성자:이한빈 
	 * @설명문:회원가입처리 디비에 저장
	 */
	@Override
	public void sign(Member member) {
		sqlSession.insert("MemberMapper.sign",member);
	}

	@Override
	public Member login(HashMap<String, String> hMap) {
		return sqlSession.selectOne("MemberMapper.login",hMap);
	}
}
