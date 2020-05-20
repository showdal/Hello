package com.increpas.www.controller.board;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.www.controller.ClsController;
import com.increpas.www.dao.*;
import com.increpas.www.vo.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteProc implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/clsProj/board/board.cls";
		req.setAttribute("isRedirect", true);
		// 1. 세선에 기록된 아이디를 가져온다.
		String sid = (String) req.getSession().getAttribute("SID");
		// 저장경로 가져오고...
		String path = req.getSession().getServletContext().getRealPath("brdimg");
		// 2. 스트림 방식으로 전송된 데이터를 파라미터 방식으로 변환시킨다.
		MultipartRequest multi = null;
		try {
			multi = new MultipartRequest(req, path, 1024 * 1024 * 10, "UTF-8", new DefaultFileRenamePolicy());
		} catch(Exception e) {
			
		}
		// 데이터 꺼내고
		String title = multi.getParameter("title");
		String body = multi.getParameter("body");
		BoardVO bVO = new BoardVO();
		bVO.setId(sid);
		bVO.setTitle(title);
		bVO.setBody(body);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", sid);
		map.put("title", title);
		map.put("body", body);
		
		// 디비작업하고
		BoardDAO bDAO = new BoardDAO();
		int cnt = bDAO.addBoard(map);
		if(cnt != 1) {
			view = "/clsProj/board/board.cls";
			req.setAttribute("isRedirect", true);
			return view;
		}
		
		// cnt == 1 인 경우...
		// 데이터베이스에 이미지 데이터를 추가한다.
		FileVO fVO = new FileVO();
		fVO.setId(sid);
		fVO.setMulti(multi);
		boolean bool = bDAO.addImgInfo(fVO);
		if(!bool) {
			view ="/clsProj/board/errorMsg.cls";
			req.setAttribute("isRedirect", true);
		}
		return view;
	}

}
