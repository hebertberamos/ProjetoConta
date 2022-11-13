import java.util.Scanner;

public class ProgramTeste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com as informações da conta:");
        System.out.print("nome do usuário:");
        String userName = sc.nextLine();
        System.out.println("Número da conta: ");
        int accountNumber = sc.nextInt();  
        System.out.println("Saldo: ");
        Double balance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        Double withdraLimit = sc.nextDouble();


        sc.close();
    }
}
