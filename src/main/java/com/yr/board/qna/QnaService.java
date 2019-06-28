package com.yr.board.qna;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yr.board.BoardDTO;
import com.yr.board.BoardService;

@Service
public class QnaService implements BoardService{
	
	@Inject
	private QnaDAO qnaDAO;
	
	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		
		return qnaDAO.setData(boardDTO);
	}

	
}
