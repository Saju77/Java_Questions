package addHandler;

import dao.AddUser;
import dao.UserDAO;
import entity.Users;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserMB {

    Users user = new Users();

    public Users getUsers() {
        return user;
    }

    public void setUsers(Users users) {
        this.user = users;
    }

    public String addUser() {

        user.setUserName(user.getUserName());
        user.setUserEmail(user.getUserEmail());
        user.setPassword(user.getPassword());
        new AddUser().addUser(user);
        return null;
    }
    
    public void login(){
        UserDAO ud= new UserDAO();
        ud.checkUser(user);
    }

}
