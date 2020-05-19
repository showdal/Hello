package day03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day03/LoginForm.cls2")
public class LoginForm extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) 
											throws ServletException, IOException{
		// 이 클래스는 로그인 폼 요청이 오면 실행되어야 할 클래스이다.
		// 요청에 대한 맵핑이 이루어져야 하는데
		// 최근버젼에서는 어노테이션을 사용해서 요청에 대한 맵핑을 할 수 있게 됬다.
		// 형식 ] @WebServlet("요청내용")
		
		// 이 클래스가 해야될 일은
		// 해당 요청이 서버에 전달이 되었을 때
		// 특별히 할일이 있는것은 아니고
		// 단지 뷰만 보여주면 된다.
		
		RequestDispatcher rd = req.getRequestDispatcher("/day03/Login.jsp");
		rd.forward(req, resp);
		
	}
}
