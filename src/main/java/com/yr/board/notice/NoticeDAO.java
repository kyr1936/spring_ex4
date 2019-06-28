package com.yr.board.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.yr.board.BoardDAO;
import com.yr.board.BoardDTO;
import com.yr.util.DBConnector;

public class NoticeDAO implements BoardDAO{
	
	private DBConnector dbConnector;

	public void setDbConnector(DBConnector dbConnector) {
		this.dbConnector = dbConnector;
	}

	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		System.out.println("noticeDAO");
		Connection con = dbConnector.getConnect();
		String sql = "insert into notice values(notice_seq.nextval,?,?,?,sysdate,0)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getWriter());
		st.setString(3, boardDTO.getContents());

		int result = st.executeUpdate();
		st.close();
		con.close();
		return result;
	}


}
