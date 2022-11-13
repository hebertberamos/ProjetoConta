package entitiesAccounts;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);

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

}
