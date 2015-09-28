package com.orangeroad.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orangeroad.board.dto.Board;
import com.orangeroad.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	/**
	 * @함수명:getAllBoards
	 * @작성일:2015. 9. 27.
	 * @작성자:이한빈 
	 * @설명문:게시판 총 게시물 구하기
	 */
	private int getAllBoards(){
		return service.getAllBoards();
	}
	
	/**
	 * @함수명:viewBoard
	 * @작성일:2015. 9. 27.
	 * @작성자:이한빈 
	 * @설명문:게시판 보기
	 */
	@RequestMapping(value="/board/viewBoard" , method=RequestMethod.GET)
	public ModelAndView viewBoard(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("getAllBoards" , this.getAllBoards());
		mav.addObject("request" , request);
		service.viewBoard(mav);
		
		mav.setViewName("/board/boardMain");
		return mav;
	}
	/**
	 * @함수명:readBoard
	 * @작성일:2015. 9. 28.
	 * @작성자:이한빈 
	 * @설명문:글 읽기 기능
	 */
	@RequestMapping(value="/board/readBoard" , method=RequestMethod.GET)
	public ModelAndView readBoard(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.addObject("request" , request);
		service.readBoard(mav);
		
		mav.setViewName("/board/readBoard");
		return mav;
	}
	
	/**
	 * @함수명:writeBoard
	 * @작성일:2015. 9. 28.
	 * @작성자:이한빈 
	 * @설명문:글쓰기 페이지 이동
	 */
	@RequestMapping(value="/board/writeBoard" , method=RequestMethod.GET)
	public String writeBoard(){
		return "/board/writeBoard";
	}
	
	/**
	 * @함수명:writeBoard
	 * @작성일:2015. 9. 28.
	 * @작성자:이한빈 
	 * @설명문:글쓰기 완료
	 */
	@RequestMapping(value="/board/writeBoard" , method=RequestMethod.POST)
	public ModelAndView writeBoard(HttpServletRequest request , Board board){
		ModelAndView mav = new ModelAndView();
		mav.addObject("request" , request);
		mav.addObject("board" , board);
		service.writeBoard(mav);
		
		mav.setViewName("/board/writeBoardOk");
		return mav;
	}
	
	/**
	 * @함수명:updateBoard
	 * @작성일:2015. 9. 28.
	 * @작성자:이한빈 
	 * @설명문:글수정 페이지 이동
	 */
	@RequestMapping(value="/board/updateBoard" , method=RequestMethod.GET)
	public ModelAndView updateBoard(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.addObject("request" , request);
		
		service.updateBoard(mav);
		mav.setViewName("/board/updateBoard");
		return mav;
	}
	
	/**
	 * @함수명:updateBoard
	 * @작성일:2015. 9. 28.
	 * @작성자:이한빈 
	 * @설명문:글수정 완료
	 */
	@RequestMapping(value="/board/updateBoard" , method=RequestMethod.POST)
	public ModelAndView updateBoard(Board board){
		ModelAndView mav = new ModelAndView();
		mav.addObject("board" , board);
		service.updateOkBoard(mav);
		mav.setViewName("/board/updateOk");
		return mav;
	}
	
	@RequestMapping(value="/board/deleteBoard" ,method=RequestMethod.GET)
	public ModelAndView deleteBoard(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.addObject("request" , request);
		service.deleteBoard(mav);
		
		return null;
	}
}
