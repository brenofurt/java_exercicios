package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		Product[] vect = new Product[n]; //notar que foi usado o nome da classe do objeto correspondente
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();  // se atentar com o buffer colocando sempre o nextLine
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);  // estanciando o objeto dentro do vetor e passando os atributos como argumento p o construtor
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
		sum += vect[i].getPrice();  // get.nomeDoAtributo acessa o atributo privado
		}

		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		sc.close();

	}

}
