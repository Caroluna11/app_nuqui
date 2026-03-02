package appbank.domain;

import java.util.List;

public class User {
    int idUser;
    List<BankAccount> accounts;
    String username;
    String password;
    int failedAttempts;
    String lockUntil;

    //Metodos propios
    public boolean verifyPassword(String password){
        return true;
    }
    public void increaseFailedAttempts(){

    }
    public void resetFailedAttempts(){}

    public void lockUser(){

    }
    public boolean isUserlocked(){
        return false;
    }
    public void changePassword(String newPassword){

    }

    //Costructores


    public User(int idUser, List<BankAccount> accounts, String username, String password, int failedAttempts, String lockUntil) {
        this.idUser = idUser;
        this.accounts = accounts;
        this.username = username;
        this.password = password;
        this.failedAttempts = failedAttempts;
        this.lockUntil = lockUntil;
    }

    //Getter and setter

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void setFailedAttempts(int failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    public String getLockUntil() {
        return lockUntil;
    }

    public void setLockUntil(String lockUntil) {
        this.lockUntil = lockUntil;
    }
}
