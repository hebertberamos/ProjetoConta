import java.util.Scanner;

import entitiesAccounts.Account;
import entitiesAccounts.PersonalAccount;
import servicos.deposito.Deposito;

public class Teste{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Account acc = new PersonalAccount("hebert benigno", 65478, 500.00, "08693666371");
        Deposito dep = new Deposito(500.00, acc);
        dep.processarDeposito();
        
        System.out.println(acc.getBalance()); 

        sc.close();
    }
}
