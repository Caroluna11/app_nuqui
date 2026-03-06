package appbank.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends Person{
    String username;
    String password;
    int failedAttempts;
    String lockUntil;
    List<BankAccount> accounts;

    //own methods
    public User createUser(User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero ID: ");
        user.setIdNumber(sc.nextLine());
        System.out.println("Ingrese su nombre: ");
        user.setName(sc.nextLine());
        System.out.println("Ingrese su apellido: ");
        user.setLastName(sc.nextLine());
        System.out.println("Ingrese su telefono: ");
        user.setPhone(sc.nextLine());
        System.out.println("Ingrese su ciudad: ");
        user.setCity(sc.nextLine());
        System.out.println("Ingrese su email: ");
        user.setEmail(sc.nextLine());
        System.out.println("Ingrese su direccion: ");
        user.setAddress(sc.nextLine());
        System.out.println("Ingrese su fecha de nacimiento: ");
        user.setBirthdate(sc.nextLine());
        System.out.println("Ingrese su username: ");
        user.setUsername(sc.nextLine());
        System.out.println("Ingrese su password: ");
        user.setPassword(sc.nextLine());
        return user;
    }

    public User updateUser(User user){
        return user;
    }

    public List<User> getAllUser(){
        return null;
    }

    public User getUserById(int id){
        return null;
    }

    public void deleteUser(int id){}


    public boolean verifyPassword(String password){
        return true;
    }
    public void increaseFailedAttempts(){

    }
    public void resetFailedAttempts(){}

    public void lockUser(){

    }
    public boolean isUserLocked(){
        return false;
    }
    public void changePassword(String newPassword){

    }

    public void addBankAccount(BankAccount bankAccount){
        this.accounts.add(bankAccount);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    //Constructor
    public User(){
        accounts = new ArrayList<>();
    }

    public User(String username, String password, int failedAttempts, String lockUntil) {
        this.username = username;
        this.password = password;
        this.failedAttempts = failedAttempts;
        this.lockUntil = lockUntil;
        accounts = new ArrayList<>();
    }

    //Getter and setter

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
