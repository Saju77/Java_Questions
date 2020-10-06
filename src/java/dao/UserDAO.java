package dao;

import entity.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class UserDAO {

    public void checkUser(Users user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query=session.createQuery("from Users where userName=?, password=?");
            query.setString(0, user.getUserName());
            query.setString(1, user.getPassword());
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
}
