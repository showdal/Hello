package com.increpas.www.dao;

import java.sql.*;
import java.util.*;

import com.increpas.www.DB.*;
import com.increpas.www.sql.*;
import com.increpas.www.vo.*;
/**
 * 
 * @author kimsujin
 *
 */
public class MembDAO {
	WebDBCP db;
	MembSQL mSql;
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MembDAO() {
		db = new WebDBCP();
		mSql = new MembSQL();
	}
	// 정보 가져오는 함수
	public ArrayList<MembVO> getInfo(){
		ArrayList<MembVO> list = new ArrayList<MembVO>();
		con = db.getCon();
		String sql = mSql.getSql(mSql.MEM_INFO);
		stmt = db.getSTMT(con);
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				do {
					MembVO mVO = new MembVO();
					mVO.setMno(rs.getInt("mno"));
					mVO.setId(rs.getString("id"));
					mVO.setName(rs.getString("name"));
					mVO.setMail(rs.getString("mail"));
					mVO.setTel(rs.getString("tel"));
					mVO.setGen(rs.getString("gen"));
//					mVO.setmDate(rs.getDate("sdate"));
//					mVO.setmTime(rs.getTime("sdate"));
//					mVO.setsDate();
					list.add(mVO);
				} while(rs.next());
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

	public MembVO selInfo(String id){
		MembVO vo = new MembVO();
		con = db.getCon();
		String sql = mSql.getSql(mSql.SEL_MEMB);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next(); 
//			MembVO mVO = new MembVO();
			vo.setMno(rs.getInt("mno"));
			vo.setId(rs.getString("id"));
			vo.setName(rs.getString("name"));
			vo.setMail(rs.getString("mail"));
			vo.setTel(rs.getString("tel"));
			vo.setGen(rs.getString("gen"));
//			vo.setmDate(rs.getDate("mdate"));
//			vo.setmTime(rs.getTime("mdate"));
			System.out.println("### dao mno : " + rs.getInt("mno"));
//			vo.setsDate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return vo;
	}
	
	public ArrayList<String> getColor(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("red");
		list.add("pink");
		list.add("purple");
		list.add("blue");
		list.add("aqua");
		list.add("green");
		list.add("yellow");
		list.add("orange");
		
		return list;
	}
	
}
