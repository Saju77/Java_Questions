package dao;

import entity.AskQuestion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class AskQuestionDAO {
    
    public boolean addAskQuestion(AskQuestion askQ) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(askQ);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
        
}
