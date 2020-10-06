package entity;
// Generated Mar 10, 2020 10:50:08 PM by Hibernate Tools 4.3.1

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SubQuestions  implements java.io.Serializable {


     private Integer subQuesId;
     private Subjects subjects;
     private String subQuesText;
     private String opt1;
     private String opt2;
     private String opt3;
     private String opt4;

    public SubQuestions() {
    }

    public SubQuestions(Subjects subjects, String subQuesText, String opt1, String opt2, String opt3, String opt4) {
       this.subjects = subjects;
       this.subQuesText = subQuesText;
       this.opt1 = opt1;
       this.opt2 = opt2;
       this.opt3 = opt3;
       this.opt4 = opt4;
    }
   
    public Integer getSubQuesId() {
        return this.subQuesId;
    }
    
    public void setSubQuesId(Integer subQuesId) {
        this.subQuesId = subQuesId;
    }
    public Subjects getSubjects() {
        return this.subjects;
    }
    
    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }
    public String getSubQuesText() {
        return this.subQuesText;
    }
    
    public void setSubQuesText(String subQuesText) {
        this.subQuesText = subQuesText;
    }
    public String getOpt1() {
        return this.opt1;
    }
    
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }
    public String getOpt2() {
        return this.opt2;
    }
    
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }
    public String getOpt3() {
        return this.opt3;
    }
    
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }
    public String getOpt4() {
        return this.opt4;
    }
    
    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }




}


