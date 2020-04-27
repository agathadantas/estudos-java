//Gerente é um funcionario, gerente herda da classe Funcionario.
public class Designer extends Funcionario {


	public double getBonificacao() {
		System.out.println("CHAMANDO MÉTODO BONIFICAÇÃO DO DESIGNER");
		return super.getBonificacao() + 105;	
	}
	
	
}
