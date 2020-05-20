package com.increpas.www.controller.member;

import java.util.*;

import javax.servlet.http.*;

import com.increpas.www.controller.*;
import com.increpas.www.dao.*;
import com.increpas.www.vo.*;

public class MemberList implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/member/memberList.jsp";
		MembDAO mDAO= new MembDAO();
		
		ArrayList<String> color = mDAO.getColor();
		req.setAttribute("COLOR", color);
		ArrayList<MembVO> list = mDAO.getInfo();
		req.setAttribute("LIST", list);
		return view;
	}

}
