package com.increpas.www.controller.ajax;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import com.increpas.www.dao.*;

@WebServlet("/member/id.ck")
public class IdCheck extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		// 1. 데이터 받고
		String sid = req.getParameter("id");
		// 2. 데이터베이스 작업해서 결과 받고
		int cnt = new MemberDAO().getIdCnt(sid);
		// 3. 결과를 json 문서로 만들어서 응답해주고
		PrintWriter pw = null;
		try {
			pw = resp.getWriter();
			pw.println("{");
			pw.println("	\"cnt\": " + cnt);
			pw.println("}");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
