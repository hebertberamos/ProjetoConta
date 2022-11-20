package servicos.deposito;

import entitiesAccounts.Account;

public class Deposito {

    private Double valorDeposito;
    
    private Account account;

    public Deposito(){
    }

    public Deposito(Double valorDeposito, Account account) {
        this.valorDeposito = valorDeposito;
        this.account = account;
    }

    public Double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(Double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public void processarDeposito(){
        double valorFinal = valorDeposito + account.getBalance();

        account.setBalance(valorFinal);

    }
}
