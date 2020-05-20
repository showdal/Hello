package com.increpas.www.controller.member;

import javax.servlet.http.*;
import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;
import com.increpas.www.controller.*;
import com.increpas.www.dao.*;
import com.increpas.www.vo.*;

public class JoinProc implements ClsController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/clsProj/member/join.cls";
		req.setAttribute("isRedirect", true);
		
//		String id = req.getParameter("id");
//		String name = req.getParameter("name");
//		System.out.println(id + " | " + name);
		/*
		   이 컨트롤러는 지금까지의 컨트롤러와 조금 다르다.
		   지금까지는 parameter 방식으로 데이터가 전달이 되었지만 
		    ==> req.getParameter() 로 처리하면 되었지만..
		    
		    지금은 파라미터 방식이 아닌 스트림 방식으로 데이터가 전달이 되기 때문에
		    받는 방식도 스트림 방식으로 받아 주어야 한다.
		    
		    스트림 방식으로 처리해주는 라이브러리
		    	cos.jar
		    	file-upload.jar
		    를 주로 사용하는데... 
		 *  
		    cos.jar에는
		    	MultipartRequest 라는 클래스가 그 역할을 담당한다.
		    
		    	사용법]
		 *  		new MultipartRequest(req, 서버의 저장경로, 업로드할 파일의 최대크기, 인코딩방식,
		 *  									파일이름이 중복되는 경우 처리할 정책);
		    
		    이 클래스를 new 시키면 
		    	1. byte[] 로 전송된 데이터를 사용하기 편하도록 parameter 방식으로 변환시켜준다.
		    	2. 파일 업로드가 완성이 된다.
		 *  		==> 서버의 지정한 경로에 파일이 저장이 된다.
		 *  
		    	저장경로 지정방법
		    
		    		1. 다운로드만을 위해서 저장한다면
		    			==> 서버의 아무 곳이나 가능
		    
		    				예]	
		 *  					d:\\upload
		  			2. 화면에 사용하기 위해서 저장하는 경우
		 *				반드시 realPath 를 찾아서 저장해야 한다.
		 *					
		 *					예]
		 *						String path = req.getSession().getServletContext().getRealPath("profile");
		 *
		 *			3. 업로드할 파일의 최대 크기를 바이트 단위로 지정한다.
		 *				예] 6MB
		 *					==> 1024 * 1024 * 6
		 *			
		 *			4. 인코딩 방식
		 *				파일의 이름이 한글인 경우 파일의 이름이 깨질 수 있다.
		 *				이런 경우를 대비해서 한글 파일의 이름을 복구할 인코딩 방식을 지정하는 것이다.
		 *
		 *				예]
		 *					encoding="utf-8"
		 *
		 			5. 이름이 중복되는 경우 해결하는 정책
		 				파일 이름 뒤에 (1), (2), ... 등의 숫자를 이용해서 변경하는 방식을 기본적으로 제공해주고 있다.
		 				 	DefalutFileRenamePolicy p = new DefaultFileRenamePolicy();
		 				 	
		 *  					
		 */
		// 스트림으로 날아온 데이터를
		// 파라미터 방식으로 변환시키자
		
//		String pw = req.getParameter("pw");
//		String mail = req.getParameter("mail");
//		String tel = req.getParameter("tel");
//		String no = req.getParameter("ano");
//		int ano = Integer.parseInt(no);	//??
//		
//		JoinDAO jDAO = new JoinDAO();
//		int cnt = jDAO.addInfo(name, id, pw, mail, tel, ano);
		MultipartRequest multi = null;
		String path = req.getSession().getServletContext().getRealPath("profile");
		System.out.println("***** cont path : " + path);
		try {
			multi = new MultipartRequest(req, path, 1024 * 1024 * 10, "UTF-8", new DefaultFileRenamePolicy());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 일반 컨트롤러보다 한 가지 작업을 더 해야 하는데
		// byte[] 파라미터로 바꾸는 작업이다.
		
		/*
		 	파라미터 받고
		  		*****
		  		스트림 방식으로 전송된 데이터를 파라미터로 바꿔서 저장하고 있는데
		  		저장된 곳은 req가 아니고 multi에 저장이 되어있다.
		 */
		String name = multi.getParameter("name");
		String id = multi.getParameter("id");
		String pw = multi.getParameter("pw");
		String mail = multi.getParameter("mail");
		String gen = multi.getParameter("gen");
		String tel = multi.getParameter("tel");
		String strano = multi.getParameter("avt");
		int ano = Integer.parseInt(strano);
		
		// mVO 만들어주고
		MemberVO mVO = new MemberVO();
		mVO.setName(name);
		mVO.setId(id);
		mVO.setPw(pw);
		mVO.setMail(mail);
		mVO.setGen(gen);
		mVO.setTel(tel);
		mVO.setAno(ano);
		
		// 데이터베이스에 질의명령 보내고  결과받고
		MemberDAO mDAO = new MemberDAO();
		int cnt = mDAO.addMemb(mVO);
		if(cnt != 1) {
			view = "/clsProj/member/joinForm.cls";
			return view;
		}
		
		// 회원정보 테이블에 입력이 완료 되었으므로 회원활동이 가능한 상태가 됐다.
		// 따라서 로그인 처리를 해주기로 하자
		req.getSession().setAttribute("SID", id);
		
		// 회원 테이블에 데이터가 입력이 되었으므로 이제 프로필 테이블에 데이터를 입력하자.
		ProfileVO pVO = new ProfileVO();
		pVO.setId(id);
		cnt = mDAO.addProf(pVO, multi);
		if(cnt != 1) {
			System.out.println("*** 회원 정보는 정상적으로 입력 되었지만, 프로필 입력은 실패했습니다. ***\n회원정보 수정페이지에서 프로필 사진을 등록해주세요.");
		}
		
		return view;
	}

}
