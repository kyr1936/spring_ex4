package com.yr.board.qna;


import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yr.board.BoardDAO;
import com.yr.board.BoardDTO;
import com.yr.util.DBConnector;

@Repository	// new QnaDAO(); // qnaDAO
//@Named(value = "") : 이름 지정
public class QnaDAO implements BoardDAO{
	
	// 생성자나 setter를 이용해야 함
	// annotation을 이용하면 pool(xml저장소?) 에서 꺼내옴
	@Autowired
	private DBConnector dbConnector;

	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		Connection con = dbConnector.getConnect();
		String sql = "insert into qna values(notice_seq.nextval, ?,?,?,sysdate,0,notice_seq.currval,0,0)";
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
