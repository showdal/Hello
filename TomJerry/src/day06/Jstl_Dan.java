package day06;

/**
 * 이 클래스는 
 * 		/pre/JSTL_Dan.cls2
 * 요청이 오면 해당하는 뷰를 보여주는 기능을 가진 클래스
 * 
 * @author	쇼영
 * @since	2020/05/08
 * 
 */

import javax.servlet.*;
import javax.servlet.http.*;

public class Jstl_Dan extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/day06/jstl_dan.jsp";
		
		// 뷰 부르고
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
