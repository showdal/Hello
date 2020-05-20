package com.increpas.www.controller.survey;

import javax.servlet.http.*;
import java.util.*;

import com.increpas.www.controller.*;
import com.increpas.www.dao.*;
import com.increpas.www.vo.*;

public class Survey implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/survey/survey.jsp";
		//필요한 데이터가 없으므로 질의명령을 바로 보내고 결과를 바로 반환받기
		SurveyDAO sDAO = new SurveyDAO();
		//데이터베이스 작업하고 결과받기
		ArrayList<SurveyVO> list = sDAO.getPaper();
//		System.out.println("**** list size : " + list.size());
		int sino = list.get(0).getSino();
		String title = list.get(0).getTitle();
		
		//데이터 넘겨주기 
		req.setAttribute("SINO", sino);
		req.setAttribute("TITLE", title);
		req.setAttribute("LIST", list);
		return view;
	}

}