package com.increpas.www.dao;

import java.util.*;
import java.io.File;
import java.sql.*;
import com.increpas.www.DB.*;
import com.increpas.www.vo.*;
import com.oreilly.servlet.MultipartRequest;
import com.increpas.www.sql.*;

public class BoardDAO {
	WebDBCP db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	BoardSQL bSQL;
	
	public BoardDAO() {
	db = new WebDBCP();
	bSQL = new BoardSQL();
	}

	// 게시판 테이블 글 등록 데이터베이스 작업 전담 처리 함수
	public int addBoard(HashMap<String, String> map) {
		int cnt = 0;
		// 1. 커넥션
		con = db.getCon();
		// 2. 질의명령
		String sql = bSQL.getSQL(bSQL.ADD_BRD);
		// 3. pstmt 
		pstmt = db.getPSTMT(con, sql);
		try {
			// 4. 질의명령 완성
			pstmt.setString(1,map.get("id"));
			pstmt.setString(2, map.get("title"));
			pstmt.setString(3, map.get("body"));
			// 5. 질의명령 보내고 결과받고
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		// 6. 결과 내보내고
		return cnt;
	}
	
	// 게시판 파일 정보 등록 전담 처리 함수
	public boolean addImgInfo(FileVO fVO) {
		boolean bool = false;
		// 업로드 된 파일 갯수 변수
		int cnt = 0;
		// 데이터베이스에 추가된 행 수
		int result = 0;
		// 1. 커넥션
		con = db.getCon();
		// 2. 질의명령
		String sql = bSQL.getSQL(bSQL.ADD_BRDIMG);
		// 3. pstmt
		// 4. 데이터 만들고
		MultipartRequest multi = fVO.getMulti();
		
		Enumeration en = multi.getFileNames();
		while(en.hasMoreElements()) {
			pstmt = db.getPSTMT(con, sql);
			// 업로드된 파일의 키(name) 값을 알아내고
			String key = (String) en.nextElement();
			// 해당 키 값을 가지고 있는 파일 이름을 알아낸다.
			String oriname = multi.getOriginalFileName(key);
			if(oriname == null || oriname.length() == 0) {
				// 이 경우는 파일을 선택하지 않은 경우이므로, 다음 회차로 진행한다.
				continue;
			}
			++cnt;
			// 실제 저장된 이름을 알아낸다.
			String savename = multi.getFilesystemName(key);
			// 파일 사이즈 알아내고
			File file = multi.getFile(key);
			long len = file.length();
				
			try {
				// 5. 질의명령 완성
				pstmt.setString(1, fVO.getId());
				pstmt.setString(2, oriname);
				pstmt.setString(3, savename);
				pstmt.setLong(4, len);
				// 6. 보내고 결과 받고
				result += pstmt.executeUpdate();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				db.close(pstmt);
			}
		}
		db.close(con);
		// 7. 결과 비교해서 반환
		if(cnt == result) {
			bool = true;
		}
		return bool;
	}
	
	// 게시판 리스트 뽑기
	public ArrayList<BoardVO> getAllList(){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		con = db.getCon();
		String sql = bSQL.getSQL(bSQL.SEL_ALL_LIST);
		stmt = db.getSTMT(con);
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BoardVO bVO = new BoardVO();
				bVO.setBno(rs.getInt("bno"));
				bVO.setTitle(rs.getString("title"));
				bVO.setId(rs.getString("id"));
				bVO.setbDate(rs.getDate("bdate"));
				bVO.setbTime(rs.getTime("bdate"));
				bVO.setsDate();
				bVO.setClick(rs.getInt("click"));
				list.add(bVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list; 
	}
}
