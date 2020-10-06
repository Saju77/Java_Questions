package dao;

import entity.AskQuestion;
import entity.Subjects;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class ListDAO {

    public List subList() {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Subjects> sList = session.createQuery("Select subName from Subjects").list();
        sList.toString();
        session.close();

        return sList;
    }

    public List<Subjects> subListByName(String name) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Subjects> sList = session.createQuery("from Subjects where lower(subName)='" + name.toLowerCase() + "'").list();
        sList.toString();
        session.close();

        return sList;
    }
    
    public List<AskQuestion> askQuesListByName(int desc) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<AskQuestion> sList = session.createQuery("from AskQuestion where askQuestionid='" + desc + "'").list();
        sList.toString();
        session.close();

        return sList;
    }

    public List allAskQuesList() {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<AskQuestion> qList = session.createQuery("from AskQuestion").list();
        qList.toString();
        session.close();

        return qList;
    }
    
}
