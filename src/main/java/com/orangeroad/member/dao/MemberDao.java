package com.orangeroad.member.dao;

import java.util.HashMap;

import com.orangeroad.member.dto.Member;

public interface MemberDao {

	public void sign(Member member);

	public Member login(HashMap<String, String> hMap);

}
