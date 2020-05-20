package com.increpas.www.controller.reBoard;

import javax.servlet.http.*;

import com.increpas.www.controller.*;

public class ReBoardReply implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/reBoard/reBoardReply.jsp";
		
		return view;
	}

}
