
public class TestaValores {
	public static void main(String[] args) {
		
		//construtor vai rodar aqui
		Conta conta = new Conta(123, 321);
		Conta conta1 = new Conta(123, 4654);
		Conta conta2 = new Conta(12463, 4564);
		
		//o titular é null
		System.out.println(conta.getTitular());
		
		//conta está inconsistente
		conta.setAgencia(-200);
		conta.setNumero(-100);
		
		//retorna 0 pq é o valor default se eu não passar
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		System.out.println("total de contas: " + Conta.getTotal());
	}
}
