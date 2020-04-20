public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "426.082.966-70";
		paulo.profissao = "Professor";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(1000);
		
		//associa a conta ao cliente
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
		
	}
}