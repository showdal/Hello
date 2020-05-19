package day03;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/d03/test.cls2")
public class Test01 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) 
													throws ServletException, IOException{
		System.out.println("### test.cls2 start ###");
		
		// 응답 문서를 만들어서 응답할 수도 있다.
		// 이때 사용할 수 있는 클래스는 PrintWriter 를 사용해서 
		// 응답 문서를 만들어 주면 된다.
		
		// 응답 문서의 인코딩 방식 정해주고
		resp.setCharacterEncoding("UTF-8");
		
		// 응답문서 작성도구 만들고
		PrintWriter pw = resp.getWriter();
		
		// 응답 문서 작성하고
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>PrintWriter Test</title>");
		pw.println("<meta charset=\"UTF-8\">");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3 style=\"text-align: center;\">컨트롤러에서 만들어준 응답 문서</h3>");
		pw.println("</body>");
		pw.println("</html>");
		
	}
}
