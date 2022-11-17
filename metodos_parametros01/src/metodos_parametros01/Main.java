package metodos_parametros01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nomePessoa;
		int idadePessoa;
		MandaMenssagem oi = new MandaMenssagem();  //Estanciando o objeto.
		
		Scanner input = new Scanner(System.in);

		oi.enviaMensagem();
	
		System.out.println("Informe seu nome: ");
		nomePessoa = input.nextLine();
		System.out.println("Informe sua idade: ");
		idadePessoa = input.nextInt();
		
		oi.mandaBoasVindas(nomePessoa, idadePessoa);
		
		input.close();

	}

}
