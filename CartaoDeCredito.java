import java.time.LocalDate;

public class CartaoDeCredito extends Cartao {

	public String getNumero() {
		return this.numero;
		
	}
	private double limite;
    private double saudoDevedor;
	@Override
	public void pagar(double valor) {
		this.limite -= valor;
		saudoDevedor+= valor;
	}
    public LocalDate dataDeVencimento;
    
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaudoDevedor() {
		return saudoDevedor;
	}

	public void setSaudoDevedor(double saudoDevedor) {
		this.saudoDevedor = saudoDevedor;
	}
	
}
