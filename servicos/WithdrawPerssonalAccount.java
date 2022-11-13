package servicos;

public class WithdrawPerssonalAccount implements Withdraw{

    @Override
    public double tax(double amount) {
        return 0;
    }
    
}
