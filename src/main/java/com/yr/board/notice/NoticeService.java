package com.yr.board.notice;

import com.yr.board.BoardDTO;
import com.yr.board.BoardService;

public class NoticeService implements BoardService{
	private NoticeDAO noticeDAO;
	
	//setter 를 이용
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}

	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		System.out.println("noticeService");
		// TODO Auto-generated method stub
		return noticeDAO.setData(boardDTO);
	}


}
