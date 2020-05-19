package day04;
/**
 * 이 클래스는 로그인 요청을 처리를 할 클래스이다. 
 * 우리는 로그인 처리를 세션에 아이디를 기억시키는 것으로 한다. 
 * @author	박광호
 * @since	2020.05.06
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import day04.dao.MemberDao;
// 요청을 남겨두면 안되는 상황 
public class LoginProc extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse resp) {
		// 할일 
		
		// 1. 데이터 받고 <== 파라미터로 전달된 데이터 받아서 변수에 담고  
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		// 2. 데이터베이스 작업에 데이터 넘기고 
		MemberDao mDao = new MemberDao();
		// 3. 결과 받고 
		int cnt = mDao.getCnt(id, pw);
		
		// 4. 결과에 따라서 처리하고 
		/*
			결과가 어떻게 나오던지 결국
			페이지는 새로운 요청이 발생해서 
			띄워져야 할 것이다.
		 */
		String view = "";
		if(cnt == 0) {
			// 이 경우는 정보에 맞는 회원이 없다는 이야기이므로 
			// 다시 로그인 페이지로 이동한다.
			view = "/TomJarry/pre/Login.cls2";
		} else {
			// 이 경우는 정보에 맞는 회원이 1명 있다는 이야기이므로 
			// 로그인 처리를 해줘야 한다.
			// 이 경우는 로그인 처리를 해줘야 하는데 
			// 지금은 임시로 로그인 처리후 로그인페이지로 이동시키기로 한다.
			view = "/TomJarry/pre/Login.cls2";
			HttpSession session = req.getSession();
			session.setAttribute("SID",id);
		}
 		try {
 			resp.sendRedirect(view);
 		} catch(Exception e) {
 			e.printStackTrace();
 		}
	}
}
