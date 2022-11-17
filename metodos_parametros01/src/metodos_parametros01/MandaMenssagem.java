package metodos_parametros01;

public class MandaMenssagem {
	
	public void enviaMensagem() {
		System.out.println("Bem-vindo a minha humilde residência! ");
	}
	
	public void mandaBoasVindas(String nome, int idade) {
		System.out.printf("Olá, %s, voce tem %d anos de idade?", nome, idade);
	}

}
