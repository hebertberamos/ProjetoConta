package servicos;

public class Invoice {
    
    private Double withdrawValue;
    private Double tax;

    public Invoice(){
    }

    public Invoice(Double withdrawValue, Double tax) {
        this.withdrawValue = withdrawValue;
        this.tax = tax;
    }

    public Double getWithdrawValue() {
        return withdrawValue;
    }

    public void setWithdrawValue(Double withdrawValue) {
        this.withdrawValue = withdrawValue;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    
    public Double totalPaymente(){
        return getWithdrawValue() + getTax();
    }
}
