import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
public class ContaPoupanca extends Conta{
	@Override
	public String toString() {
		return "ContaPoupanca []";
	}

	private Timer tempo = new Timer();
	 public void ler(int num, double saudo, String name) {
		 this.saudo = saudo;
		 this.numero = num;
		 this.mudarNome(name);
		
		 
	 }
	
	public ContaPoupanca() {
		ContaPoupanca.this.taxa = 0.005;//taxa de rendimento diaria
	    int TIME = (1000 * 60 * 60 *24);
	    JOptionPane.showMessageDialog(null, "digite o valor do deposito inicial da conta");
		
		
		
	
		TimerTask tarefa = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
	        ContaPoupanca.this.render();
			}
			
		};	
		
		this.tempo.schedule(tarefa, TIME);

		
	}
	

	
	
	

}
