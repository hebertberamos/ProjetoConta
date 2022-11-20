import java.util.Scanner;

import entidadeServico.TaxPerssonalAccount;
import entitiesAccounts.Account;
import entitiesAccounts.BusinessAccount;
import entitiesAccounts.PersonalAccount;
import servicos.deposito.Deposito;
import servicos.saque.Fatura;
import servicos.saque.Saque;
import servicos.saque.ServicoSaque;


public class ProgramTeste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("qual ação deseja relaizar?\n(s) - saque\n(d) - deposito");
        char resp1 = sc.next().charAt(0);

        System.out.println("A conta é pessoal ou comercial? (p)/(c)");
        char resp2 = sc.next().charAt(0);

        System.out.println("Informações da conta: ");
        System.out.print("Nome do usuário: ");
        String userName = sc.nextLine();
        sc.nextLine();
        System.out.print("Número da conta: ");
        int AccountNumber = sc.nextInt();
        System.out.print("Saldo: ");
        Double saldo = sc.nextDouble();
        if(resp2 == 'p'){
            System.out.print("informe seu CPF: ");
            String cpf = sc.next();
            Account acc = new PersonalAccount(userName, AccountNumber, saldo, cpf);
            if(resp1 == 's'){
                System.out.print("entre com o valor dp limite de seus saques: ");
                Double limiteSaque = sc.nextDouble();
                Saque saque = new Saque(acc, limiteSaque);
                System.out.println("informe o valor do saque: ");
                Double valorSaque = sc.nextDouble();
                saque.setFatura(new Fatura(valorSaque));

                ServicoSaque ss = new ServicoSaque(new TaxPerssonalAccount());
                ss.processarFatura(saque);

                System.out.println(" --------------- AÇÃO REALIZADA --------------- ");
                System.out.println();
                System.out.println("----------------- FATURA -----------------");
                System.out.println();
                System.out.println("valor básico do saque: " + String.format("%.2f", saque.getFatura().getValorSaque()));
                System.out.println("valor da taxa: " + String.format("%.2f", saque.getFatura().getTax()));
                System.out.println("valor total a pagar: " + String.format("%.2f", saque.getFatura().pagamentoTotal()));
            }
            else if(resp1 == 'd'){
                System.out.println("Informe o valor que deseja depositar");
                Double valorDeposito = sc.nextDouble();
                Deposito dep = new Deposito(valorDeposito, acc);
                dep.processarDeposito();
                
                
                System.out.println(" --------------- AÇÃO REALIZADA ---------------");
                System.out.println();
                System.out.println("Valor depositado: " + valorDeposito);
                System.out.println("Valor atual da conta: " + acc.getBalance());                
            }
        }
        else {
            System.out.print("entre com o CNPJ da empresa: ");
            String cnpj = sc.next();
            Account acc = new BusinessAccount(userName, AccountNumber, saldo, cnpj);
            if(resp1 == 's'){
                System.out.print("entre com o valor dp limite de seus saques: ");
                Double limiteSaque = sc.nextDouble();
                Saque saque = new Saque(acc, limiteSaque);
                System.out.println("informe o valor do saque: ");
                Double valorSaque = sc.nextDouble();
                saque.setFatura(new Fatura(valorSaque));

                ServicoSaque ss = new ServicoSaque(new TaxPerssonalAccount());
                ss.processarFatura(saque);

                System.out.println("----------------- FATURA -----------------");
                System.out.println();
                System.out.println("valor básico do saque: " + String.format("%.2f", saque.getFatura().getValorSaque()));
                System.out.println("valor da taxa: " + String.format("%.2f", saque.getFatura().getTax()));
                System.out.println("valor total a pagar: " + String.format("%.2f", saque.getFatura().pagamentoTotal()));
                System.out.println("valor total na sua conta: " + acc.getBalance());
            }
            else if(resp1 == 'd'){
                System.out.println("Informe o valor que deseja depositar");
                Double valorDeposito = sc.nextDouble();
                Deposito dep = new Deposito(valorDeposito, acc);
                dep.processarDeposito();
                
                
                System.out.println(" --------------- AÇÃO REALIZADA ---------------");
                System.out.println();
                System.out.println("Valor depositado: " + valorDeposito);
                System.out.println("Valor atual da conta: " + acc.getBalance()); 
            }
        }      


        
        sc.close();
    }
}
