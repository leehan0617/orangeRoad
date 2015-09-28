package com.orangeroad.board.service;

import org.springframework.web.servlet.ModelAndView;



public interface BoardService {

	public int getAllBoards();

	public void viewBoard(ModelAndView mav);

	public void readBoard(ModelAndView mav);

	public void writeBoard(ModelAndView mav);

	public void updateBoard(ModelAndView mav);

	public void updateOkBoard(ModelAndView mav);

	public void deleteBoard(ModelAndView mav);

}
