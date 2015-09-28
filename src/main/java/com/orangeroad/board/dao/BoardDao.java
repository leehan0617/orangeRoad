package com.orangeroad.board.dao;

import java.util.List;

import com.orangeroad.board.dto.Board;



public interface BoardDao{

	public int getAllBoards();

	public List<Board> viewBoard(int startRow, int endRow);

	public Board readBoard(int boardNumber);

	public void writeBoard(Board board);

	public Board getBoard(int boardNumber);

	public void updateOkBoard(Board board);

	public void deleteBoard(int boardNumber);

}
