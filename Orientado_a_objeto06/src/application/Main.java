package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 5 precisei declar a variavel account fora do if pra poder estaciar e funcionar em todo o  sistema.
		
		Account account; 

		// 4 - entre com as informações sysout.. scanner..
		System.out.println("Enter account number: ");
		int number = sc.nextInt(); // variável temporária..
		System.out.println("enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine(); // variável temporária..
		
		System.out.println("Is there any initial deposity? (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value ");
			double initialDeposit = sc.nextDouble(); // Variavel temporária..
			account = new Account(number, holder, initialDeposit); // 5.1 - Estanciei o objeto e lembrei de importar a biblioteca dele.
		}
		else {
			account = new Account(number, holder); // 5.2 estanciei o objeto 
		}
		
		System.out.println();
		System.out.println("Account data: ");   
		System.out.println(account);   // 6.2 fazer o método toString para usar aqui
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account); // 6.3 o toString esta sendo usado aqui
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println(account.toString());  // 6.4 o toString esta sendo usado aqui tbm!	
		
		sc.close();

	}

}
