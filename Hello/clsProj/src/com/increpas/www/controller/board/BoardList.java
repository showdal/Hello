package com.increpas.www.controller.board;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.www.controller.ClsController;
import com.increpas.www.dao.*;
import com.increpas.www.vo.*;

public class BoardList implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/board/boardList.jsp";
		BoardDAO bDAO = new BoardDAO();
		ArrayList<BoardVO> list = bDAO.getAllList();
		
		req.setAttribute("LIST", list);
		return view;
	}

}
