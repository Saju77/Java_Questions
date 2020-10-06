package addHandler;

import dao.AddDAO;
import entity.AskQuestion;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class AskQuestionMB {

    AskQuestion ask = new AskQuestion();

    public AskQuestion getAsk() {
        return ask;
    }

    public void setAsk(AskQuestion ask) {
        this.ask = ask;
    }

    public String addQuestion() {
        ask.setDescription(ask.getDescription());
        ask.setUserEmail(ask.getUserEmail());
        boolean status = new AddDAO().addAskQuestion(ask);
        if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Your Question is added", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Your Question is not added", ""));
        }

        return null;
    }
}
