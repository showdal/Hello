package day05.dao;

import java.sql.*;
import DB.*;
import day05.vo.*;
import day05.sql.*;

public class MembDao {
	ORCLJDBC db;
	MembSQL msql;
	public MembDao() {
		db= new ORCLJDBC();
		msql = new MembSQL();
	}
	
	// 회원 아이디로 회원 정보를 가져오는 작업 처리 전담 함수
	public MembVO getInfo(String id) {
		MembVO mvo = new MembVO();
		ResultSet rs = null;
		//할일
		//1. 커넥션 가져오고
		Connection con = db.getCon();
		//2. 질의명령 가져오고
		String sql = msql.getSQL(msql.SEL_INFO);
		//3. 스테이트먼트 준비 
		PreparedStatement pstmt = db.getPSTNT(sql, con);
		try {
			//4. 질의 완성
			pstmt.setString(1, id);
			//5. 질의 보내고 결과 받고 
			rs = pstmt.executeQuery();
			//6. 결과에서 데이터 뽑아와 VO에 담고 
			//한줄 내리고
			rs.next();

			mvo.setId(rs.getString("id"));
			mvo.setName(rs.getString("name"));
			mvo.setTel(rs.getString("tel"));
			mvo.setMail(rs.getString("mail"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		//7. 데이터내보내고
		return mvo;
		
	}

}
