package appbank.domain;

import java.util.List;

public class BankAccount {
    String accountNumber;
    double balance;
    String accountType;
    String statusAccount;
    List<Transaction> transactions;

    //Metodos propios

    public Transaction deposit(double amount){
        return null;
    }
    public Transaction withdraw(double amount){
        return null;
    }
    public Transaction transfer(BankAccount destination, BankAccount source){
        return null;
    }
    public double checkBalance(){
        return 0;
    }
    public List<Transaction> checkTransactions(){
        return null;
    }

    //Costructores



    public BankAccount(String accountNumber, double balance, String accountType, String statusAccount, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.statusAccount = statusAccount;
        this.transactions = transactions;
    }

    //Getter and setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStatusAccount() {
        return statusAccount;
    }

    public void setStatusAccount(String statusAccount) {
        this.statusAccount = statusAccount;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
