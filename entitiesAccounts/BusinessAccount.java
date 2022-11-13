package entitiesAccounts;

public class BusinessAccount extends Account {
    
    public String cnpj;

    public BusinessAccount(){
    }

    public BusinessAccount(String userName, Integer accountNumber, double balance, double withdrawLimit, String cnpj) {
        super(userName, accountNumber, balance, withdrawLimit);
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
        return super.toString() +
        "\nCNPJ: " + cnpj;
    }

    
}
