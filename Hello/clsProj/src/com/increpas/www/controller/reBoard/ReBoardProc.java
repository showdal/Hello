package com.increpas.www.controller.reBoard;

import javax.servlet.http.*;

import com.increpas.www.controller.*;
import com.increpas.www.dao.*;

public class ReBoardProc implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/clsProj/reBoard/reBoard.cls";
		req.setAttribute("isRedirect", true);
		String body = req.getParameter("body");
		String sid = (String)req.getSession().getAttribute("SID");
		ReBoardDAO rDAO = new ReBoardDAO();
		int cnt = rDAO.addData(sid, body);
		
		return view;
	}

}
