class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	// construtor
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("Total de contas: " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta aqui");
		System.out.println("Agência: " + this.agencia + " Numero: " + this.numero);

		
		
	}
	

	public void deposita(double valor) {
		this.saldo += +valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
	    if(this.saca(valor)) {
	        destino.deposita(valor);
	        return true;
	    } else {
	        return false;
	    }
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode número menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode número menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
		
	}
}