package day06;

import javax.servlet.*;
import javax.servlet.http.*;

public class JTest04 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/day06/jstl_test04.jsp";
		System.out.println(req.getParameter("id"));
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
