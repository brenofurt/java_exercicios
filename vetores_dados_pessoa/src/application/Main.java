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
		
		Pessoa[] vect= new Pessoa[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa:");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			vect[i] = new Pessoa(altura, genero);
		}
		
		double menorAltura = vect[0].getAltura();
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
		}
		
		System.out.printf("MENOR ALTURA = %.2f%n", menorAltura);
		
		double maiorAltura = vect[0].getAltura();
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
		}
		
		System.out.printf("MAIOR ALTURA = %.2f%n", maiorAltura);
		
		double soma = 0.0;
		double cont = 0.0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getGenero() == 'f') {
				soma += vect[i].getAltura();
				cont += 1.0;
	
			}
		}
		
		double mediaMulheres = soma / cont;
		System.out.printf("Media das alturas das mulheres: %.2f%n", mediaMulheres);
		
		int cont2 = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getGenero() == 'm') {
				cont2 += 1;
			}
		}
			
		System.out.print("Numero de homens = " + cont2);
		
		sc.close();
	}

}
