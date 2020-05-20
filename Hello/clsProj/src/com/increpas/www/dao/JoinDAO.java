package com.increpas.www.dao;

import java.sql.*;
import java.util.*;
import com.increpas.www.DB.*;
import com.increpas.www.sql.*;

public class JoinDAO {
	WebDBCP db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	JoinSQL jSQL;
	
	public JoinDAO() {
		db = new WebDBCP();
		jSQL = new JoinSQL();
	}
	
	public int addInfo(String name, String id, String pw, String mail, String tel, int ano) {
		int cnt = 0;
		
		con = db.getCon();
		String sql = jSQL.getSQL(jSQL.ADD_DATA);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, mail);
			pstmt.setString(5, tel);
			pstmt.setInt(6, ano);
			
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
		
}
