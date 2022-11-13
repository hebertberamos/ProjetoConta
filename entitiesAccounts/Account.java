package entitiesAccounts;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);

    protected String userName;
    protected Integer accountNumber;
    protected double balance;
    protected double withdrawLimit;

    public Account(){
    }

    public Account(String userName, Integer accountNumber, double balance, double withdrawLimit) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= withdrawLimit){
            this.balance -= amount;
        }
        else{
            while(amount > withdrawLimit){
                System.out.print("o valor informado ultrapassa o seu  limite de saque\nPor favor, informe um valor válido:");
                amount = sc.nextDouble();
                if(amount <= withdrawLimit){
                    this.balance -= amount;
                }
            }
        }
        
    }

    @Override
    public String toString() {
        return "UserName: " + userName + "\nAccountNumber: " + accountNumber + "\nBalance: " + balance + "\nWithdraw Limit: " + withdrawLimit;
    }
}
