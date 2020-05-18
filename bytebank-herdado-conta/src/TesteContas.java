
public class TesteContas {

		public static void main(String[] args) {
			
			ContaCorrente cc = new ContaCorrente(156, 554422);
			cc.deposita(100.00);
			
			System.out.println("Saldo da Conta Corrente " + cc.getNumero() + ": R$ " + cc.getSaldo() + "\n");
			
			ContaPoupanca cp = new ContaPoupanca(1010, 98765);
			cp.deposita(300);
			
			System.out.println("Saldo da Conta Poupança " + cp.getNumero() + ": R$ " + cp.getSaldo());
			
			cc.transfere(10, cp);
			
			System.out.println("\nPoupança: " + cp.getSaldo());
			System.out.println("Corrente: " + cc.getSaldo());
		}
	
}
