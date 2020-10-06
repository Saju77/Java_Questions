package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AskAns  implements java.io.Serializable {


     private Integer askAnsid;
     private AskQuestion askQuestion;
     private String description;
     private String userEmail;

    public AskAns() {
    }

    public AskAns(AskQuestion askQuestion, String description, String userEmail) {
       this.askQuestion = askQuestion;
       this.description = description;
       this.userEmail = userEmail;
    }
   
    public Integer getAskAnsid() {
        return this.askAnsid;
    }
    
    public void setAskAnsid(Integer askAnsid) {
        this.askAnsid = askAnsid;
    }
    public AskQuestion getAskQuestion() {
        return this.askQuestion;
    }
    
    public void setAskQuestion(AskQuestion askQuestion) {
        this.askQuestion = askQuestion;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }




}


