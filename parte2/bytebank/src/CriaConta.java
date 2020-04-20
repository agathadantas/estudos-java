public class CriaConta {
	public static void main(String[] args) {

		// estou buscando o objeto Conta.java, a estrutura, assim criando uma variavel
		// que vai receber aquele modelo
		Conta primeiraConta = new Conta();

		// dentro dessa variavel eu vou chegar ao atributo que quero inserir valor
		// através do ponto.
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		//pegando o valor que coloquei dentro do objeto e atribuindo mais
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;

		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);

		segundaConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está na agencia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}