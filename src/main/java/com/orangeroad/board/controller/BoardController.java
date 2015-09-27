package com.orangeroad.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orangeroad.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	/**
	 * @함수명:viewBoard
	 * @작성일:2015. 9. 27.
	 * @작성자:이한빈 
	 * @설명문:게시판 전체글 가져오기
	 */
	@RequestMapping(value="/board/viewBoard" , method=RequestMethod.GET)
	public ModelAndView viewBoard(){
		ModelAndView mav = new ModelAndView();
		
		service.viewBoard(mav);
		
		mav.setViewName("/board/boardMain");
		return mav;
	}
}
