package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas: "); 
		int n = input.nextInt();
		
		double[] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite a altura da " + (i + 1) + "a pessoa: ");
			altura[i] = input.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += altura[i];
		}
		
		double alturaMedia = soma / n;
		
		System.out.printf("Altura média das pessoas: %.2f", alturaMedia);
		
		input.close();

	}

}
