package entidadeServico;

public class TaxBusinessAccount implements TaxService{

    @Override
    public double tax(double valordeSaque) {
        if(valordeSaque > 1000){
            return valordeSaque * 0.3;
        }
        else{
            return valordeSaque * 0.15;
        }
    }
    
}