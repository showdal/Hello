package com.increpas.www.sql;

public class JoinSQL {
	public final int ADD_DATA = 1001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case ADD_DATA:
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, ano) ");
			buff.append("VALUES( ");
			buff.append("	(SELECT NVL(MAX(MNO)+1, 1000) FROM member), ");
			buff.append("	?, ?, ?, ?, ?, ? ");
			buff.append(")");
			break;
		}
		return buff.toString();
	}
}
