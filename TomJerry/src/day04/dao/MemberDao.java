package day04.dao;
/**
 * 이 클래스는 회원에 관련된 데이터베이스 작업을 처리할 클래스이다.
 * @author	박광호
 * @sORCLe	2020.05.06
 * 
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB.ORCLJDBC;
import day04.dvo.MemVO;
import day04.sql.MemberSQL;

public class MemberDao {
	ORCLJDBC db = null;
	Connection con = null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	MemberSQL mSQL = null;
	public MemberDao() {
		// 이 클래스에서는 데이터베이스 작업을 반드시 할 것이므로
		// 데이터베이스를 관리할 클래스를 초기화 해준다.
		db = new ORCLJDBC();
		// 데이터베이스 작업에는 반드시 질의 명령이 필요하므로 전담 클래스도 초기화 해준다.
		mSQL = new MemberSQL();
		/*
			데이터베이스 테이블이 준비 안된 사람은 내일까지 반드시 준비하고 
			오늘은 주소 
						192.168.0.21:1521:orcl
		 */
	}
	// 로그인 데이터베이스 작업 전담 처리함수 
	public int getCnt(String id, String pw) {
		// 반환값 데이터를 저장할 변수 만들고 
		int cnt = 0;
		// 할일
		
		// 1. 커넥션 얻어오고 
		con = db.getCon();
		// 2. 질의명령 얻어오고 
		String sql = mSQL.getSQL(mSQL.SEL_LOGIN);
		// 3. PreparedStatement 얻어오고 
		pstmt = db.getPSTNT(sql,con);
		// 4. 질의명령 완성해서
		try {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			// 5. 질의명령 보내고 결과 받고 
			rs = pstmt.executeQuery();
			// 한줄 내리고
			rs.next();
			cnt = rs.getInt("cnt");
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		// 6. 데이터 전달하고 
		return cnt;
	}
	// 아이디 갯수 조회 디비 작업 전담 처리함수 
	public int idCount(String id) {
		int cnt=0 ;
		// 할일
		// 1. 커넥션 얻어오고
		con = db.getCon();
		// 2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_IDCK);
		// 3. PreparedStatement 얻어오고 
		pstmt = db.getPSTNT(sql,con);
		
		try {
			// 4. 질의명령 완성하고
			pstmt.setString(1, id);
			// 5. 질의명령 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 6. 결과 꺼내오고
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
			
		}
		// 7. 결과 내보내고 
		return cnt;
	}
	// 아이디 맞으면 정보 조회해서 꺼내오기 
	public MemVO getInfo(String id) {
		MemVO mvo = new MemVO();
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_MEM);
		pstmt = db.getPSTNT(sql,con);
		try {
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			rs.next();
			mvo.setId(id);
			mvo.setName(rs.getString("name"));
			mvo.setTel(rs.getString("tel"));
			mvo.setMail(rs.getString("mail"));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return mvo;
	}
}
