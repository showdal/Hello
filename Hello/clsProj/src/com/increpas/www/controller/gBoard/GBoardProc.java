package com.increpas.www.controller.gBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.www.controller.ClsController;
import com.increpas.www.dao.GBoardDAO;

public class GBoardProc implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/clsProj/gBoard/gBoardList.cls";
		req.setAttribute("isRedirect", true);
		String body = req.getParameter("body");
		String sid = (String) req.getSession().getAttribute("SID");
		GBoardDAO gDAO = new GBoardDAO();
		int cnt = gDAO.addData(sid, body);
		return view;
	}

}