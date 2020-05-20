package com.increpas.www.controller.reBoard;

import javax.servlet.http.*;

import com.increpas.www.controller.*;
import com.increpas.www.dao.*;

public class ReBoardWrite implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/reBoard/reBoardWrite.jsp";
		HttpSession session = req.getSession();
		String sid = (String)session.getAttribute("SID");
		if(sid == null || sid.length() == 0) {
			view = "/clsProj/member/login.cls";
			req.setAttribute("isRedirect", true);
		}
		ReBoardDAO rDAO = new ReBoardDAO();
		return view;
	}

}
