import java.util.Random;

public abstract class Cartao implements FormaPagamento{
      protected String numero;
      protected int bandeira;
	  protected int emissor;
	  protected Cliente cliente;
	  protected Conta contaDoCartao;
	  
	  public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	protected int contaCliente;
	  protected int digitoVerificador;
	  Random random = new Random();
	  public Cartao() {
		  bandeira = (int) (random.nextDouble()*10);
	 	  this.tornarPositivo(bandeira);
	 	  emissor  = (int) (random.nextDouble()*90000);
	 	  emissor  += 10000;
	 	  this.tornarPositivo(emissor);
	 	  contaCliente= (int) (random.nextDouble() *900000000);
	 	  this.tornarPositivo(contaCliente);
	 	  contaCliente+= 1000000000; //sao 1 seguido de 9 zeros para os 9 digitos do cliente e da conta do cartão
	 	  
	 	  digitoVerificador= (int) (random.nextDouble()*10);
	 	  this.tornarPositivo(digitoVerificador);
	 	  this.numero = Integer.toString(bandeira);
	 	  this.numero += Integer.toString(emissor);
	 	  this.numero +=	  Integer.toString(contaCliente);
	 	  this.numero +=Integer.toString(digitoVerificador);
		}
   public Cartao(Cliente cliente){
 	  bandeira = (int) (random.nextDouble()*10);
 	  this.tornarPositivo(bandeira);
 	  emissor  = (int) (random.nextDouble()*90000);
 	  emissor  += 10000;
 	  this.tornarPositivo(emissor);
 	  contaCliente= (int) (random.nextDouble() *900000000);
 	  this.tornarPositivo(contaCliente);
 	  contaCliente+= 1000000000; //sao 1 seguido de 9 zeros para os 9 digitos do cliente e da conta do cartão
 	  
 	  digitoVerificador= (int) (random.nextDouble()*10);
 	  this.tornarPositivo(digitoVerificador);
 	  this.numero = Integer.toString(bandeira);
 	  this.numero += Integer.toString(emissor);
 	  this.numero +=	  Integer.toString(contaCliente);
 	  this.numero +=Integer.toString(digitoVerificador);
 	  this.setCliente(cliente);
   }
public int getEmissor() {
	return emissor;
}
public void setEmissor(int emissor) {
	this.emissor = emissor;
}
public int getContaCliente() {
	return contaCliente;
}
public void setContaCliente(int contaCliente) {
	this.contaCliente = contaCliente;
}
public int getDigitoVerificador() {
	return digitoVerificador;
}
public void setDigitoVerificador(int digitoVerificador) {
	this.digitoVerificador = digitoVerificador;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public void tornarPositivo(int i) {
if(i<0) {
	i*= -1;
}
}
   
}
