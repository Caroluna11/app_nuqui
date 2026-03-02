package appbank.domain;

public class Transaction {
    int transactionId;
    String date;
    String typeTransaction;
    double amount;
    String status;
    BankAccount sourceAccount;
    BankAccount destinationAccount;

    //Metodos propios

    public String getDetail(){
        return null;
    }
    public double getAmount(){
        return 0;
    }
    public String getType(){
        return null;
    }

    //Costructores


    public Transaction(int transactionId, String date, String typeTransaction, double amount, String status, BankAccount sourceAccount, BankAccount destinationAccount) {
        this.transactionId = transactionId;
        this.date = date;
        this.typeTransaction = typeTransaction;
        this.amount = amount;
        this.status = status;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    //Getter and setter


    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BankAccount getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(BankAccount sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public BankAccount getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(BankAccount destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}
