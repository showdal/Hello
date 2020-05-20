package com.increpas.www.controller.survey;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

import com.increpas.www.dao.*;

@WebServlet("/survey/surveyInfoProc.ck")
public class SurveyInfoProc extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse resp) {
		int cnt = 0;
		int sino = 0;
		
		// 전달받은 데이터 꺼내고
		String title = req.getParameter("title");
		String start = req.getParameter("start");
		String end = req.getParameter("end");
		
		// 데이터베이스 작업하고
		SurveyDAO sDAO = new SurveyDAO();
		sino = sDAO.addSurveyInfo(title, start, end);
		if(sino != 0) {
			cnt = 1;
		}
		try {
			PrintWriter pw = resp.getWriter();
			pw.println("{");
			pw.println("	\"cnt\": " + cnt +",");
			pw.println("	\"sino\": " + sino);
			pw.println("}");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
