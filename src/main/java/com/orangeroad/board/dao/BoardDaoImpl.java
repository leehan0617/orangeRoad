package com.orangeroad.board.dao;

import java.util.HashMap;
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
	public int getAllBoards() {
		return sqlSession.selectOne("getAllBoards");
	}

	@Override
	public List<Board> viewBoard(int startRow, int boardSize) {
		HashMap<String,Integer> hMap = new HashMap<String,Integer>();
		hMap.put("startRow", startRow-1);
		hMap.put("boardSize", boardSize);
		
		return sqlSession.selectList("BoardMapper.viewBoard" , hMap);
	}

	@Override
	public Board readBoard(int boardNumber) {
		return sqlSession.selectOne("BoardMapper.readBoard" , boardNumber);
	}

	@Override
	public void writeBoard(Board board) {
		sqlSession.insert("BoardMapper.writeBoard" , board);
	}

	@Override
	public Board getBoard(int boardNumber) {
		return sqlSession.selectOne("BoardMapper.getBoard" , boardNumber);
	}

	@Override
	public void updateOkBoard(Board board) {
		sqlSession.update("BoardMapper.updateBoard" , board);
	}

	@Override
	public void deleteBoard(int boardNumber) {
		sqlSession.delete("BoardMapper.deleteBoard" , boardNumber);
	}
}
