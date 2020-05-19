package day04.sql;
/**
 * 이 클래스는 day04 패키지에서 사용할 질의 명령을 저장하고 반환해주는 기능의 클래스
 * @author	박광호
 * @since	2020.05.06
 *
 */
public class MemberSQL {
	public final int SEL_LOGIN = 1001;
	public final int SEL_IDCK = 1002;
	public final int SEL_MEM = 1003;
	
	public String getSQL(int code) {
		StringBuffer buff= new StringBuffer();
							
		switch(code) {
		case SEL_LOGIN :
						buff.append("SELECT ");
						buff.append("	count(*) cnt ");
						buff.append("FROM ");
						buff.append("	member ");
						buff.append("WHERE ");
						buff.append("	id = ? ");
						buff.append("	AND pw = ? ");
				break;
		case SEL_IDCK :
						buff.append("SELECT ");
						buff.append("	count(*) cnt ");
						buff.append("FROM ");
						buff.append("	member ");
						buff.append("WHERE ");
						buff.append("	id = ? ");
				break;
		case SEL_MEM :
						buff.append("SELECT ");
						buff.append("	name, tel, mail ");
						buff.append("FROM ");
						buff.append("	member ");
						buff.append("WHERE ");
						buff.append("	id = ? ");
				break;		
		}
		return buff.toString();
	}
}
