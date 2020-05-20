package com.increpas.www.controller.survey;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

import com.increpas.www.controller.*;
import com.increpas.www.dao.*;
import com.increpas.www.vo.*;

public class SurveyResult implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/survey/surveyResult.jsp";
		// 0. 회원이 설문조사에 참여했는지 여부를 확인한다.
		// 1.  파라미터 받고
		String strsino = req.getParameter("sino");
		int sino = 0;
		try {
			sino = Integer.parseInt(strsino);
		} catch(Exception e) {}
		SurveyDAO sDAO = new SurveyDAO();
		ArrayList<SurveyVO> list = sDAO.getResult(sino);
		
		System.out.println("************ list.get(0).sq : " + list.get(0).getSq());
		// 만든데이터 뷰에 심어주고
		req.setAttribute("LIST", list);
		req.setAttribute("TITLE", list.get(0).getTitle());
		
		return view;
	}

}
