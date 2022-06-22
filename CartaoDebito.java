
public class CartaoDebito extends Cartao {
      
	@Override
	public void pagar(double valor) {
		this.contaDoCartao.saudo -= valor;
	}
 
}
