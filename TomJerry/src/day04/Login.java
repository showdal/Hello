package day04;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse resp) {

		String url = "/day04/login.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(url);
		try {
			rd.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("###### Login Request #######");
	}

}
