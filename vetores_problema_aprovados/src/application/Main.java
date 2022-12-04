package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aluno[] vect = new Aluno[n];
		
		double media = 0.0;
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			media = 0.0;
			vect[i] = new Aluno(name, nota1, nota2, media);	
		}
		
		
		for(int i = 0; i < vect.length; i++) {
			media = (vect[i].getNota1() + vect[i].getNota2()) / 2.0;
			vect[i].setMedia(media);
		}
		
		System.out.println("ALUNOS APROVADOS: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getMedia() >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

	}

}
