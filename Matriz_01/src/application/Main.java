package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas posições seram digitadas? ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) { // percorre as linhas
			for(int j = 0; j < n; j++) { // percorre as colunas
				System.out.print("Digite o " + (j+1) + "o número da linha " + (i+1) + ": ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Main Diagonal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + "  ");
		}
		
		System.out.println();
		int soma = 0;
		System.out.print("Negative numbers: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] < 0) {
					soma += 1;
				}
			}
		}	
		
		System.out.print(soma);
		
		sc.close();

	}

}
