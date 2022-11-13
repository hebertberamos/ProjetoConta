package entitiesAccounts;

public class PersonalAccount extends Account{
    
    public String cpf;

    public PersonalAccount(){
    }

    public PersonalAccount(String userName, Integer accountNumber, double balance,  double withdrawLimit, String cpf) {
        super(userName, accountNumber, balance, withdrawLimit);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        return super.toString() 
        + "CPF: " + cpf;
    }
    
}
