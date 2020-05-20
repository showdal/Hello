package com.increpas.www.sql;

public class MembSQL {
	public final int MEM_INFO = 1001;
	public final int SEL_MEMB = 2001;
	
	public String getSql(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case MEM_INFO:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail, tel, gen ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case SEL_MEMB:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail, tel, gen ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			break;
		}
		return buff.toString();
	}
}
