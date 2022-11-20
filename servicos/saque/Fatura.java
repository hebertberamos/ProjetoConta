package servicos.saque;

public class Fatura {
    
    public Double valorSaque;
    public Double tax;

    public Fatura(){
    }

    public Fatura(Double valorSaque, Double tax) {
        this.valorSaque = valorSaque;
        this.tax = tax;
    }

    public Fatura(Double valorSaque){
        this.valorSaque = valorSaque;
    }

    public Double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    
    public Double pagamentoTotal(){
        return valorSaque + tax;
    }
}
