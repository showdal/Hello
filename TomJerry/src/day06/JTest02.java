package day06;

import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

public class JTest02 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		// 할일
		// 이 컨트롤러는 jstl_test02.jsp 파일을 보여주기만 하면 되는컨트롤러이다.
		String view = "/day06/jstl_test02.jsp";
		
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
		
		// 뷰를 부른다.
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
