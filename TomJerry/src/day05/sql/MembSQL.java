package day05.sql;

public class MembSQL {
	public final int SEL_INFO = 1001;

	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();

		switch (code) {
		case SEL_INFO:
			buff.append("SELECT ");
			buff.append(" id, name,tel,mail ");
			buff.append("FROM ");
			buff.append(" member ");
			buff.append("WHERE ");
			buff.append(" id = ? ");
			break;
		}

		return buff.toString();

	}
}
