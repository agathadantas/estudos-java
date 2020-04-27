
public class TesteFuncionario {
	
	public static void main(String[] args) {

		Funcionario ana = new Funcionario();
		ana.setNome("Ana Paula Silva");
		ana.setCpf("425874263-72");
		ana.setSalario(2000.00);
		
		System.out.println("Nome: " + ana.getNome());
		System.out.println("CPF: " + ana.getCpf());
		System.out.println("Salário: " + ana.getSalario());
		System.out.println("Bonificação: " + ana.getBonificacao());
		
	}
}
