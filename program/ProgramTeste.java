import java.util.Scanner;

import entitiesAccounts.Account;
import entitiesAccounts.BusinessAccount;

public class ProgramTeste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println(" ------ começar a ver a questão das contas ------");
        System.out.println();

        System.out.println(" ------- PRIMEIRA CONTA -------");

        Account acc1 = new Account("hebert benigno da silva", 6514, 800.00);
        System.out.println(acc1);

        System.out.println(" ------- SEGUNDA CONTA -------");

        Account acc2 = new BusinessAccount("Mayane de lima aguiar", 84256, 500.00, "6548411235");
        System.out.println(acc2);

        System.out.println(" ------- TERCEIRA CONTA -------");
        
        System.out.println();

        sc.close();
    }
}
