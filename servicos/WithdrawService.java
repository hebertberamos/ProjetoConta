package servicos;

import entitiesAccounts.Account;

public class WithdrawService {
    
    private Double withdrawLimit;

    private Invoice invoice;
    private Account account;
    
    public WithdrawService(){
    }

    public WithdrawService(Double withdrawLimit, Account account) {
        this.withdrawLimit = withdrawLimit;
        this.account = account;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
