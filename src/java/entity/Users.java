package entity;

import dao.UserDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Users  implements java.io.Serializable {


     private Integer userId;
     private String userName;
     private String userEmail;
     private String password;

    public Users() {
    }

    public Users(String userName, String userEmail, String password) {
       this.userName = userName;
       this.userEmail = userEmail;
       this.password = password;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

public String login(){
        UserDAO ud= new UserDAO();
        ud.checkUser(this);
        return "home.xhtml";
    }


}


