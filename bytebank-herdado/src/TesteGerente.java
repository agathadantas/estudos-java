
public class TesteGerente {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("6843211-92");
		g1.setSalario(5000.00);
		
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salário: " + g1.getSalario());
		
		System.out.println("Senha: " + autenticou);
		//System.out.println(g1.autentica(1234));
		
		System.out.println("Bonificação: " + g1.getBonificacao());
	}
}