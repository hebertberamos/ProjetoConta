package entitiesAccounts;

public class PersonalAccount extends Account{
    
    public String cpf;

    public PersonalAccount(){
    }

    public PersonalAccount(String userName, Integer accountNumber, double balance, String cpf) {
        super(userName, accountNumber, balance);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
