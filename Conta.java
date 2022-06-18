
public class Conta implements Iconta {
 @Override
	public String toString() {
		return nomeCliente();
	}

int numero = 0 ;
 double taxa = 0;
 double saudo = 0;
 Cliente cliente = new Cliente();
 public void deposito(double valor) {
	 saudo += valor;
 }
 public void render() {
	  this.saudo*=(1+taxa);
 }
 public void transferir(double valor, Conta cc) {
	 this.saudo-=valor;
	 this.saudo+=valor;
 }
 public void mudarNome(String nome)  {
	 this.cliente.setNome(nome);
 }
 String nomeCliente() {
	 return this.cliente.getNome();
 }

 public void extrato() {
	 System.out.println("numero: " + this.numero);
	 System.out.println("saudo: " + this.saudo);
	 System.out.print("cliente: " + this.nomeCliente());//ele está imprimindo o endereço de memória
	 
 }
}
 

