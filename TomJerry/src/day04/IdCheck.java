package day04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day04.dao.MemberDao;
import day04.dvo.MemVO;

public class IdCheck extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		resp.setCharacterEncoding("UTF-8");

		// 할일 
		// 1. 데이터(파라미터 받고 
		String id = req.getParameter("id");
		// 2. 데이터 디비 처리로 전달하고 
		MemberDao mDao = new MemberDao();
		int cnt = mDao.idCount(id);
		MemVO mvo = mDao.getInfo(id);
		
		String sid = id;
		String name = mvo.getName();
		String tel = mvo.getTel();
		String mail = mvo.getMail();
		
		// 3. 결과에 따라서 응답문서 만들고 
		PrintWriter pw = null;
		String result = "";
		try {
			pw = resp.getWriter();
			if(cnt ==0) {
				result=" \"result\":\"ok\"";
			}else {
				result=" \"result\":\"no\", \"id\":\"" + sid + "\", \"Name\" :\""+name+"\" ,\"Tel\":\""+tel+"\",\"Mail\":\""+mail+"\"";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("{");
		pw.println(result);
		pw.println("}");
	}
}
