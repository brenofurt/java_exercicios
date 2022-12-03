package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		int posiMaior = 0;
		double guardar = vect[0];
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] > guardar) {
				guardar = vect[i];
				posiMaior = i;  // a variavel i da a posição do maior.
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", guardar);
		System.out.println("POSICAO DO MAIOR VALOR = " + posiMaior);
				
			sc.close();

	}

}
