package entidadeServico;

public class TaxPerssonalAccount implements TaxService{

    @Override
    public double tax(double valordeSaque) {
        if(valordeSaque >= 100){
            return valordeSaque * 0.2;
        }
        else{
            return valordeSaque * 0.15;
        }
    }
    
}
