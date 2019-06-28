package com.yr.s4;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yr.board.notice.NoticeDTO;
import com.yr.board.notice.NoticeService;

@Controller
@RequestMapping("/notice/")
public class NoticeController {
	
	@Inject	// 주입
	private NoticeService noticeService;
	
	@RequestMapping(value= "noticeWrite")
	public void setData(NoticeDTO noticeDTO) throws Exception {
		System.out.println("noticeController");
		noticeDTO.setTitle("title");
		noticeDTO.setContents("contents");
		noticeDTO.setWriter("writer");
		
		int result = noticeService.setData(noticeDTO);
		
		
	}
}
