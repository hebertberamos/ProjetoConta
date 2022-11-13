import java.util.Scanner;

import entitiesAccounts.Account;
import entitiesAccounts.PersonalAccount;

public class ProgramTeste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println(" ------ começar a ver a questão das contas ------");
        System.out.println();

        System.out.println(" ------- PRIMEIRA CONTA -------");

        Account acc1 = new Account("hebert benigno da silva", 6514, 800.00, 600.00);
        System.out.println(acc1);

        System.out.println();
        System.out.print("deseja realizar um saque na conta?");
        char resp = sc.next().charAt(0);
        if(resp == 's'){
            System.out.println("informe o valor que deseja sacar: ");
            double valor = sc.nextDouble();
            acc1.withdraw(valor);
            System.out.println(acc1);
        }

        System.out.println(" --------------------------------------------- ");
        System.out.println();
        System.out.println(" ------- SEGUNDA CONTA -------");
        Account acc2 = new PersonalAccount("mayane de lima aguiar", 6547899, 1000.00, 600.00, "654789125");
        System.out.println();
        System.out.println(acc2);
        System.out.println();
        System.out.println("deseja realizar um saque na conta?");
        resp = sc.next().charAt(0);
        if(resp == 's'){
            System.out.println("informe o valor que deseja sacar: ");
            double valor = sc.nextDouble();
            acc2.withdraw(valor);
        }

        System.out.println(acc2);

        sc.close();
    }
}
