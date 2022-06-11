
public abstract class Cartao {
   protected String numero;
   public int getBandeira() {
	return bandeira;
}
public void setBandeira(int bandeira) {
	this.bandeira = bandeira;
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
private int bandeira;
   private int emissor;
   private int contaCliente;
   private int digitoVerificador;
   private Cliente cliente;
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public String getNumero() {
	return numero;
}

   
}
