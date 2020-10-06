package addHandler;

import dao.AddDAO;
import dao.ListDAO;
import entity.AskQuesAns;
import entity.AskQuestion;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


@ManagedBean
@SessionScoped
public class AskQuesAnsMB {

    AskQuesAns askQuesAns = new AskQuesAns();
    Integer askQuesAnsName;
    List<AskQuestion> listAskQuesAns;
    AskQuestion askQues = new AskQuestion();

    public AskQuesAns getSubQues() {
        return askQuesAns;
    }

    public void setSubQues(AskQuesAns subQues) {
        this.askQuesAns = subQues;
    }

    public Integer getAskQuesAnsName() {
        return askQuesAnsName;
    }

    public void setAskQuesAnsName(Integer askQuesAnsName) {
        this.askQuesAnsName = askQuesAnsName;
    }

    public List<AskQuestion> getListAskQuesAns() {
        return listAskQuesAns;
    }

    public void setListAskQuesAns(List<AskQuestion> listAskQuesAns) {
        this.listAskQuesAns = listAskQuesAns;
    }

    public AskQuestion getSubject() {
        return askQues;
    }

    public void setSubject(AskQuestion subject) {
        this.askQues = subject;
    }

    public String addAskQuesAns() {
        listAskQuesAns = new ListDAO().askQuesListByName(askQuesAnsName);
        askQuesAns.setAskAnsid(listAskQuesAns.get(0).getAskQuestionid());
//        subQues.setSubQuesText(subQues.getSubQuesText());
        askQues.setAskQuestionid(listAskQuesAns.get(0).getAskQuestionid());
        askQuesAns.setAskQuestion(askQues);
        askQuesAns.setDescription(askQuesAns.getDescription());
        askQuesAns.setUserEmail(askQuesAns.getUserEmail());
        boolean status = new AddDAO().addAskQuesAns(askQuesAns);
        if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Question Answer added", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Question Answer not added", ""));
        }

        return null;
    }

    public List<SelectItem> getSubjectName() {
        List<SelectItem> subname = new ListDAO().subList();
        return subname;
    }

}
