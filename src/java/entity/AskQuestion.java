package entity;
// Generated Mar 10, 2020 10:50:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AskQuestion  implements java.io.Serializable {


     private Integer askQuestionid;
     private String description;
     private String userEmail;
     private Set askQuesAnses = new HashSet(0);

    public AskQuestion() {
    }

	
    public AskQuestion(String description, String userEmail) {
        this.description = description;
        this.userEmail = userEmail;
    }
    public AskQuestion(String description, String userEmail, Set askQuesAnses) {
       this.description = description;
       this.userEmail = userEmail;
       this.askQuesAnses = askQuesAnses;
    }
   
    public Integer getAskQuestionid() {
        return this.askQuestionid;
    }
    
    public void setAskQuestionid(Integer askQuestionid) {
        this.askQuestionid = askQuestionid;
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
    public Set getAskQuesAnses() {
        return this.askQuesAnses;
    }
    
    public void setAskQuesAnses(Set askQuesAnses) {
        this.askQuesAnses = askQuesAnses;
    }




}


