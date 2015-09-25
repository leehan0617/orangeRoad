package com.orangeroad.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.orangeroad.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
}
