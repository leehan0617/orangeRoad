package com.orangeroad.board.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	public int getAllBoards() {
		return dao.getAllBoards();
	}

	@Override
	public void viewBoard(ModelAndView mav) {
		Map<String , Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		int allBoards = Integer.parseInt(map.get("getAllBoards").toString());
		int currentPage;
		
		//한 페이지에 보여줄 게시물 숫자
		int boardSize = 3;
		//size가 5면 [1][2][3][4][5] 이거 10이면 [1][2][3]....[9][10]
		int blockSize = 5;
		
		if(request.getParameter("currentPage") == null) {
			currentPage = 1;
		}else{
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		int blockCount = allBoards/boardSize + (allBoards%boardSize == 0 ? 0:1);
		
		int startRow = (currentPage-1)*boardSize + 1; 
//		int endRow = startRow + blockSize - 1;
		List<Board> boardList = dao.viewBoard(startRow , boardSize);
		
		mav.addObject("allBoards" , allBoards);
		mav.addObject("boardSize" , boardSize);
		mav.addObject("blockSize" , blockSize);
		mav.addObject("blockCount" , blockCount);
		mav.addObject("currentPage" , currentPage);
		mav.addObject("allBoards" , allBoards);
//		mav.addObject("startRow" , startRow);
//		mav.addObject("endRow" , endRow);
		mav.addObject("boardList" , boardList);
	}

	public void readBoard(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int boardNumber = Integer.parseInt(request.getParameter("boardNumber"));
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		Board board = dao.readBoard(boardNumber);
		
		mav.addObject("board" , board);
		mav.addObject("currentPage" , currentPage);
	}

	@Override
	public void writeBoard(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		Board board = (Board) map.get("board");
		
		dao.writeBoard(board);
	}

	@Override
	public void updateBoard(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int boardNumber = Integer.parseInt(request.getParameter("boardNumber"));
		Board board = dao.getBoard(boardNumber);
		mav.addObject("board" , board);
	}

	@Override
	public void updateOkBoard(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		Board board = (Board) map.get("board");
		
		dao.updateOkBoard(board);
	}

	@Override
	public void deleteBoard(ModelAndView mav) {
		Map<String ,Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int boardNumber = Integer.parseInt(request.getParameter("boardNumber"));
		System.out.println("BoardNumber : " + boardNumber);
		dao.deleteBoard(boardNumber);
	}

}
