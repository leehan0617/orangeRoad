package com.orangeroad.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orangeroad.board.dto.Board;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Board> viewBoard() {
		return sqlSession.selectList("BoardMapper.viewBoard");
	}
}
