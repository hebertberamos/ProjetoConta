package servicos.saque;

import java.util.Scanner;

import entidadeServico.TaxService;

public class ServicoSaque {
    Scanner sc = new Scanner(System.in);

    private TaxService taxService;

    public ServicoSaque(){
    }

    public ServicoSaque(TaxService taxService) {
        this.taxService = taxService;
    }
    
    public void processarFatura(Saque saque){
            while(saque.getFatura().getValorSaque() > saque.getLimiteSaque()){
                System.out.print("valor informado é maior que o seu limite de saque\nPor favor, informe um valor válido: ");
                double valorSaque = sc.nextDouble();
                if(valorSaque <= saque.getLimiteSaque()){
                    saque.setFatura(new Fatura(valorSaque));;
                    double tax = taxService.tax(valorSaque);
                    saque.setFatura(new Fatura(valorSaque, tax));
                }
            }
        if(saque.getFatura().getValorSaque() <= saque.getLimiteSaque()){
            double valordeSaque = saque.getFatura().getValorSaque();

            double tax = taxService.tax(valordeSaque);
            saque.setFatura(new Fatura(valordeSaque, tax));
        }
    }
}
