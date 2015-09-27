package com.orangeroad.board.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int boardNumber;
	private String title;
	private String content;
	private Date registerDate;
}
