package com.orangeroad.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.orangeroad.board.dao.BoardDao;
import com.orangeroad.board.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao dao;

	@Override
	public void viewBoard(ModelAndView mav) {
		List<Board> boardList = dao.viewBoard();
		System.out.println(boardList.size());
	}
}
