package com.increpas.www.controller.member;

import javax.servlet.http.*;

import com.increpas.www.controller.*;
import com.increpas.www.dao.*;

public class Join implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/member/join.jsp";
//		HttpSession session = req.getSession();
		
		return view;
	}

}
