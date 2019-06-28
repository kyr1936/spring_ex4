package com.yr.s4;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yr.board.qna.QnaDTO;
import com.yr.board.qna.QnaService;

@Controller
@RequestMapping("/qna/")
public class QnaController {
	
	@Inject //데이터타입으로 찾아오기 때문에 동일한 데이터타입의 객체가 있으면 에러
	private QnaService qnaService;
	
	@RequestMapping(value="qnaWrite")
	public void setData(QnaDTO qnaDTO) throws Exception{
		System.out.println("qnaController");
		qnaDTO.setTitle("title");
		qnaDTO.setWriter("writer");
		qnaDTO.setContents("contents");
		
		int result=qnaService.setData(qnaDTO);
		
	}
}
