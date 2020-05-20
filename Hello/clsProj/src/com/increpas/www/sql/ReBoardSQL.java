package com.increpas.www.sql;

public class ReBoardSQL {
	public final int SEL_LIST = 1001;
	public final int SEL_ALL_CNT = 1002;
	public final int SEL_ALL_LIST = 1003;
	public final int ADD_DATA = 2001;
	public final int ADD_CMT = 3001;
	public final int EDIT_CMT = 4001;
	public final int DEL_CMT = 5001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_LIST:
			buff.append("SELECT ");
			buff.append("    rno, reno, remno mno, id, savename avatar, rebody body, reupno upno, redate, step ");
			buff.append("FROM ");
			buff.append("	(SELECT ");
			buff.append("    	ROWNUM rno, r.* ");
			buff.append("	FROM ");
			buff.append("		(SELECT ");
			buff.append("   		 reno, remno, rebody, reupno, redate, (level - 1) step, ");
			buff.append("   		 id, savename ");
			buff.append("		FROM ");
			buff.append("   		 reboard re, member m, avatar a");
			buff.append("		WHERE ");
			buff.append("   		 re.isshow = 'Y' ");
			buff.append("   		 AND m.ano = a.ano ");
			buff.append("   		 AND remno = mno ");
			buff.append("		START WITH ");
			buff.append(" 	  	 	reupno IS NULL ");
			buff.append("		CONNECT BY ");
			buff.append("    		PRIOR RENO = REUPNO ");
			buff.append("		ORDER SIBLINGS BY ");
			buff.append("    		redate DESC) R ");
			buff.append("	) ");
			buff.append("WHERE ");
			buff.append("	rno BETWEEN ? AND ? ");
			break;
		case SEL_ALL_LIST:
			buff.append("SELECT ");
			buff.append("    rno, reno, remno mno, id, savename avatar, rebody body, reupno upno, redate, step ");
			buff.append("FROM ");
			buff.append("	(SELECT ");
			buff.append("    	ROWNUM rno, r.* ");
			buff.append("	FROM ");
			buff.append("		(SELECT ");
			buff.append("   		 reno, remno, rebody, reupno, redate, (level - 1) step, ");
			buff.append("   		 id, savename ");
			buff.append("		FROM ");
			buff.append("   		 reboard re, member m, avatar a");
			buff.append("		WHERE ");
			buff.append("   		 re.isshow = 'Y' ");
			buff.append("   		 AND m.ano = a.ano ");
			buff.append("   		 AND remno = mno ");
			buff.append("		START WITH ");
			buff.append(" 	  	 	reupno IS NULL ");
			buff.append("		CONNECT BY ");
			buff.append("    		PRIOR RENO = REUPNO ");
			buff.append("		ORDER SIBLINGS BY ");
			buff.append("    		redate DESC) R ");
			buff.append("	) ");
			break;
		case SEL_ALL_CNT:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("FROM ");
			buff.append("	reboard ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			break;
		case ADD_DATA:
			buff.append("INSERT INTO ");
			buff.append("	reboard(reno, remno, rebody) ");
			buff.append("VALUES( ");
			buff.append("	(SELECT NVL(MAX(RENO)+1, 1000) FROM reboard), ");
			buff.append("	(SELECT mno FROM member WHERE id = ?), ? ");
			buff.append(")");
			break;
		case ADD_CMT:
			buff.append("INSERT INTO "); 
			buff.append("	reboard(reno, remno, rebody, reupno) "); 
			buff.append("VALUES( "); 
			buff.append("	(SELECT NVL(MAX(reno) + 1, 1000) FROM reboard), "); 
			buff.append("	(SELECT mno FROM member WHERE id = ?), ?, ? "); 
			buff.append(") "); 
			break;
		case EDIT_CMT:
			buff.append("UPDATE ");
			buff.append("	reboard ");
			buff.append("SET ");
			buff.append("	rebody = ? ");
			buff.append("WHERE ");
			buff.append("	reno = ? ");
			break;
		case DEL_CMT:
			buff.append("UPDATE ");
			buff.append("	reboard ");
			buff.append("SET ");
			buff.append("	isshow = 'N' ");
			buff.append("WHERE ");
			buff.append("	reno = ? ");
			break;
		}
		return buff.toString();
	}

}
