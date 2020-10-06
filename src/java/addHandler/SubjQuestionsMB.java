package addHandler;

import dao.AddDAO;
import dao.ListDAO;
import entity.SubQuestions;
import entity.Subjects;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

@ManagedBean
@SessionScoped
public class SubjQuestionsMB {
    
    SubQuestions subQues = new SubQuestions();
    String subjName;
    List<Subjects> listSub;
    Subjects subject = new Subjects();
    
    public SubQuestions getSubQues() {
        return subQues;
    }
    
    public void setSubQues(SubQuestions subQues) {
        this.subQues = subQues;
    }
    
    public String getSubjName() {
        return subjName;
    }
    
    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }
    
    public List<Subjects> getListSub() {
        return listSub;
    }
    
    public void setListSub(List<Subjects> listSub) {
        this.listSub = listSub;
    }
    
    public Subjects getSubject() {
        return subject;
    }
    
    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
    
    public String addSubjectQuestion() {
        listSub = new ListDAO().subListByName(subjName);
        subQues.setSubQuesId(listSub.get(0).getSubId());
//        subQues.setSubQuesText(subQues.getSubQuesText());
        subject.setSubId(listSub.get(0).getSubId());
        subQues.setSubjects(subject);
        subQues.setOpt1(subQues.getOpt1());
        subQues.setOpt2(subQues.getOpt2());
        subQues.setOpt3(subQues.getOpt3());
        subQues.setOpt4(subQues.getOpt4());
        boolean status = new AddDAO().addSubQues(subQues);
        if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Subject question added", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Subject question not added", ""));
        }
        
        return null;
    }
    
    public List<SelectItem> getSubjectName(){
        List<SelectItem> subname= new ListDAO().subList();
        return subname;
    }
    
}
