package day04;
/**
 * 이 클래스는 회원가입 폼 요청을 처리할 클래스
 * @author	박광호
 * @since	2020.05.06
 * 
 */

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Join extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse resp) {
		
		String url = "/day04/Join.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(url);
		
		try {
			rd.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("### 회원가입 폼 요청 ### ");
		
	}
}
