package entity;
// Generated Mar 10, 2020 10:50:08 PM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Subjects  implements java.io.Serializable {


     private Integer subId;
     private String subName;
     private Set subQuestionses = new HashSet(0);
     private int position = 0;
     private ArrayList<Subjects> questions = null;

    public Subjects() {
    }

	
    public Subjects(String subName) {
        this.subName = subName;
    }
    public Subjects(String subName, Set subQuestionses) {
       this.subName = subName;
       this.subQuestionses = subQuestionses;
    }
   
    public Integer getSubId() {
        return this.subId;
    }
    
    public void setSubId(Integer subId) {
        this.subId = subId;
    }
    public String getSubName() {
        return this.subName;
    }
    
    public void setSubName(String subName) {
        this.subName = subName;
    }
    public Set getSubQuestionses() {
        return this.subQuestionses;
    }
    
    public void setSubQuestionses(Set subQuestionses) {
        this.subQuestionses = subQuestionses;
    }




}


