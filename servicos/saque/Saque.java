package servicos.saque;

import entitiesAccounts.Account;

public class Saque {
    
    private Double limiteSaque;
    
    private Fatura fatura;
    private Account account;

    public Saque(){
    }

    public Saque(Account account, Double limiteSaque) {
        this.limiteSaque = limiteSaque;
        this.account = account;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    
}
