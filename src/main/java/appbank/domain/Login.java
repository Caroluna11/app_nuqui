package appbank.domain;

import java.util.List;

public class Login {
    int loginId;
    String sessionStartDate;
    User user;

    //Metodos propios

    public boolean authenticate(String username, String password){
        return true;
    }
    public void logout(User user){
    }

    //Constructores

    public Login(int loginId, String sessionStartDate, User user) {
        this.loginId = loginId;
        this.sessionStartDate = sessionStartDate;
        this.user = user;
    }

    //getter and setter

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getSessionStartDate() {
        return sessionStartDate;
    }

    public void setSessionStartDate(String sessionStartDate) {
        this.sessionStartDate = sessionStartDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
