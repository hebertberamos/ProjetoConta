package entitiesAccounts;

public class Account {
    
    protected String userName;
    protected Integer accountNumber;
    protected double balance;

    public Account(){
    }

    public Account(String userName, Integer accountNumber, double balance) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "UserName: " + userName + "\nAccountNumber: " + accountNumber + "\nBalance: " + balance;
    }

    
}
