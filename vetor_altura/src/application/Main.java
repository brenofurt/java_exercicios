package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n]; // estanciando o vetor com a classe que ira receber os dados
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura); // estanciei o objeto dentro da estrutura for (a cada novo loop, um novo objeto pessoa é criado
		}
		
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();  // dessa forma consegui acessar os elementos do vetor
		}
		double alturaMedia = soma / vect.length;
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		
		int cont = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				cont += 1;
			}
		}
		
		int porcentagem = 100 / vect.length * cont; 
		System.out.print("Pessoas com menos de 16 anos: " + porcentagem + "%");
		System.out.println();
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

	}

}
