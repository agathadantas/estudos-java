
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario func){
		double bonus = func.getBonificacao();
		this.soma = this.soma + bonus;

	}
	
	
	public double getSoma() {
		return soma;
	}

}
