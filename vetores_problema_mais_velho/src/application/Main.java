package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			vect[i] = new Pessoa(nome, idade); 
		}
		
		String maiorIdade = "a";
		int troca = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() > troca) {
				troca = vect[i].getIdade();
				 maiorIdade = vect[i].getNome();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maiorIdade);
		
		sc.close();

	}

}
