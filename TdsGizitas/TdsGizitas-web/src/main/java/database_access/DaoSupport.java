package database_access;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Dao を補助するクラス
 */
public abstract class DaoSupport {
protected Session getSession() throws HibernateException{
        Configuration config = new Configuration().configure("/hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}

