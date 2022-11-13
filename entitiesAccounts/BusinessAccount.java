package entitiesAccounts;

public class BusinessAccount extends Account {
    
    public String cnpj;

    public BusinessAccount(){
    }

    public BusinessAccount(String userName, Integer accountNumber, double balance, String cnpj) {
        super(userName, accountNumber, balance);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nCNPJ: " + cnpj;
    }

    
}
