package database_access;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class IdaApplFormInfoTblDao extends DaoSupport {
	public void save(IdaApplicationFormInfoTbl idaApplicationFormInfoTbl) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();

		session.save(idaApplicationFormInfoTbl);

		transaction.commit();
		session.close();
	}
}