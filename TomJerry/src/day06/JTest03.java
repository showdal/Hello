package day06;

import javax.servlet.*;
import javax.servlet.http.*;

public class JTest03 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		// 할일
		// 이 클래스에서 뷰를 부를때 데이터를 같이 넣어서 뷰를 부르고
		// 뷰에서는 데이터를 받아서 
		// 요청을 새롭게 만들때 데이터도 같이 넘겨주자.
		
		//  뷰만들고
		String view = "/day06/jstl_test03.jsp";
		// 데이터 심고
		req.setAttribute("id", "dDragon");
		req.setAttribute("name", "최두용");
		req.setAttribute("tel", "010-9292-4184");
		req.setAttribute("mail", "dDragon@increpas.com");
		
		// 뷰를 부르고
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
