//Gerente é um funcionario, gerente herda da classe Funcionario.
public class EditorVideo extends Funcionario {


	public double getBonificacao() {
		System.out.println("CHAMANDO MÉTODO BONIFICAÇÃO DO EDITOR DE VIDEO");
		return super.getBonificacao() + 100;	
	}
	
	
}
