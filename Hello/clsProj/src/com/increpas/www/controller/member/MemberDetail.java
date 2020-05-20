package com.increpas.www.controller.member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.increpas.www.controller.ClsController;
import com.increpas.www.dao.MembDAO;
import com.increpas.www.vo.MembVO;

public class MemberDetail implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/member/memberDetail.jsp";
		MembDAO mDAO = new MembDAO();
		String id = req.getParameter("id");
		System.out.println("*** cont id : " + id);
		MembVO vo = mDAO.selInfo(id);
		req.setAttribute("ID", vo.getId());
		req.setAttribute("VO", vo);
		return view;
	}

}
