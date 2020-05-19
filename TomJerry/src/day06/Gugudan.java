package day06;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Gugudan extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		// 할일
		// 1. 뷰 정하고
		String view = "/day06/gugudan.jsp";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("w3-green");
		list.add("w3-light-green");
		list.add("w3-lime");	
		list.add("w3-khaki");
		list.add("w3-yellow");
		list.add("w3-amber");
		list.add("w3-orange");
		list.add("w3-deep-orange");
		list.add("w3-red");
		
		req.setAttribute("LIST", list);
		
		// 2. 뷰 부르고
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
