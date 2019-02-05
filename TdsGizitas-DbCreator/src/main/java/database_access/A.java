package database_access;
import java.sql.Date;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		IdaApplFormInfoTblDao dao = new IdaApplFormInfoTblDao();
		IdaApplicationFormInfoTbl idaApplicationFormInfoTbl = new IdaApplicationFormInfoTbl();

		idaApplicationFormInfoTbl.setApplicationFromNbr("aaaaaaaaa");
		idaApplicationFormInfoTbl.setEntryDt(Date.valueOf("2018-6-29"));
		idaApplicationFormInfoTbl.setGroupId("2");

		dao.save(idaApplicationFormInfoTbl);
	}

}
