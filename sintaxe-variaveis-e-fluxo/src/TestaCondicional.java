public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicional");
		int idade = 19;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você só pode entrar porque está acompanhado");
			} else {
				System.out.println("Você não pode entrar");
			}
		}
	}
}