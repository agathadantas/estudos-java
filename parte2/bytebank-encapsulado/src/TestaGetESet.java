
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(333, 444);
		conta.setNumero(1354);
		System.out.println("Novo numero da conta: " + conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo da Silva");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		//agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Analista");
        System.out.println(conta.getTitular().getProfissao());
        
        System.out.println(titularDaConta); 
        System.out.println(paulo);
        System.out.println(conta.getTitular());


	}
}
