
public class Main {
public static void main(String args[]) {
	Cliente primeiroCliente = new Cliente();
	
	CartaoDeCredito primeiroCartao = new CartaoDeCredito();
	     primeiroCartao.setCliente(primeiroCliente);   
	    System.out.print(primeiroCartao.getNumero());
	    

	
}
}
