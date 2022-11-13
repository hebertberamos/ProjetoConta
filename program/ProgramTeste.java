import java.util.Scanner;

import entitiesAccounts.Account;

public class ProgramTeste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println(" ------ começar a ver a questão das contas ------");

        Account acc1 = new Account("hebert benigno da silva", 6514, 800.00);
        System.out.println(acc1);

        sc.close();
    }
}
