package day05;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import day05.dao.*;
import day05.vo.*;

public class MembInfo extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse resp) {
		
		// 뷰를 만든다
		String view  = "/day05/membInfo.jsp";
		
		// 데이터베이스 작업하고
		MembDao mdao = new MembDao();
		MembVO mvo = mdao.getInfo(req.getParameter("id"));
		// 데이터 심어주고 
		req.setAttribute("ID", mvo.getId());
		req.setAttribute("NAME", mvo.getName());
		req.setAttribute("TEL", mvo.getTel());
		req.setAttribute("MAIL", mvo.getMail());
		
		// VO챼로 넘겨보자 
		req.setAttribute("DATA", mvo);
		// 뷰를 부르고 
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
		} catch (Exception e) {
			System.out.println("########## 이상함 #############");
		}
		
	}
}
