package day05;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

public class InputForm extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse resp) {
		String url = "/day05/inputForm.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(url);
		
		try {
			rd.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
