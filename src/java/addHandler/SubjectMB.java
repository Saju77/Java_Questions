package addHandler;

import dao.AddDAO;
import entity.Subjects;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class SubjectMB {

    Subjects sub = new Subjects();

    public Subjects getSub() {
        return sub;
    }

    public void setSub(Subjects sub) {
        this.sub = sub;
    }

    public String addSubject() {
        sub.setSubName(sub.getSubName());
        boolean status = new AddDAO().addSub(sub);
        if (status) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Subject added", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Subject not added", ""));
        }

        return null;
    }

}
