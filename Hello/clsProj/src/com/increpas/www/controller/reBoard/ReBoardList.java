package com.increpas.www.controller.reBoard;

import java.util.*;
import javax.servlet.http.*;

import com.increpas.www.controller.*;
import com.increpas.www.dao.*;
import com.increpas.www.vo.*;
import com.increpas.www.util.*;

public class ReBoardList implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/reBoard/reBoard.jsp";
		String sid = (String) req.getSession().getAttribute("SID");
		
		// 받아야할 데이터가 있므로  꺼내고 
		int nowPage = 1;
		String strPage = req.getParameter("nowPage");
		try {
			nowPage = Integer.parseInt(strPage);
		} catch(Exception e) {}
		ReBoardDAO rDAO = new ReBoardDAO();
		int totalCount = rDAO.getTotalCount();
		
		// PageUtil 만들고
		PageUtil page = new PageUtil(nowPage, totalCount, 3, 3);
		
		// 데이터베이스 작업을 한다.
		ArrayList<ReBoardVO> list = rDAO.getAllList(page.getStartCont(), page.getEndCont());
		
		// 뷰에 데이터 심고
		req.setAttribute("LIST", list);
		req.setAttribute("PAGE", page);
		return view;
	}

}
