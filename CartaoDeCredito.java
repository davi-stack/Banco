import java.util.Random;

public class CartaoDeCredito extends Cartao implements FormaPagamento {
	protected int bandeira;
	  protected int emissor;
	  protected int contaCliente;
	  protected int digitoVerificador;
	  Random random = new Random();
      public CartaoDeCredito(Cliente cliente){
    	  bandeira = (random.nextInt())%10;
    	  emissor  = (random.nextInt())%90000;
    	  emissor  += 10000;
    	  contaCliente= (random.nextInt())%900000000;
    	  contaCliente+= 1000000000; //sao 1 seguido de 9 zeros para os 9 digitos do cliente e da conta do cartão
    	  digitoVerificador= (random.nextInt())%10;
    	  this.numero = Integer.toString(bandeira);
    	  this.numero += Integer.toString(emissor);
    	  this.numero +=	  Integer.toString(contaCliente);
    	  this.numero +=Integer.toString(digitoVerificador);
    	  this.setCliente(cliente);
    			  
      }
	public CartaoDeCredito() {
		 bandeira = (random.nextInt())%10;
   	  emissor  = (random.nextInt())%90000;
   	  emissor  += 10000;
   	  contaCliente= (random.nextInt())%900000000;
   	  contaCliente+= 1000000000; //sao 1 seguido de 9 zeros para os 9 digitos do cliente e da conta do cartão
   	  digitoVerificador= (random.nextInt())%10;
   	  this.numero = Integer.toString(bandeira);
   	  this.numero += Integer.toString(emissor);
   	  this.numero +=	  Integer.toString(contaCliente);
   	  this.numero +=Integer.toString(digitoVerificador);
	}
}
