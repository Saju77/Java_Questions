package entity;
// Generated Mar 10, 2020 10:50:08 PM by Hibernate Tools 4.3.1

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class AskQuesAns  implements java.io.Serializable {


     private Integer askAnsid;
     private AskQuestion askQuestion;
     private String description;
     private String userEmail;

    public AskQuesAns() {
    }

    public AskQuesAns(AskQuestion askQuestion, String description, String userEmail) {
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


