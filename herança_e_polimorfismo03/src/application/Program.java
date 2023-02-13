package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			if(resp == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				TaxPayer individual = new Individual(name, anualIncome, healthExpenditures);
				taxPayers.add(individual);
			}
			else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				TaxPayer company = new Company(name, anualIncome, numberOfEmployee);
				taxPayers.add(company);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer txP : taxPayers) {
			System.out.println(txP.getName() + ": $ " + String.format("%.2f", txP.tax()));  
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ ");
		double sum = 0.0;
		for(TaxPayer txP : taxPayers) {
			sum += txP.tax();
		}
		
		System.out.print(String.format("%.2f", sum));
		
		sc.close();

	}

}
