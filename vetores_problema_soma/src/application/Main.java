package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Soma;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		Soma[] vect = new Soma[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vect.length; i++) {
			int a = sc.nextInt();
			int b = 0;
			int c = 0;
			vect[i] = new Soma(a, b, c);
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vect.length; i++) {
			int b = sc.nextInt();
			vect[i].setB(b);
		}
		
		
		for(int i = 0; i < vect.length; i++) {
			int soma = vect[i].getA() + vect[i].getB();
			vect[i].setC(soma);
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i].getC());
		}
		
		sc.close();
		
	}

}
