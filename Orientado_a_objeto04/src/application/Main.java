package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Employee empl = new Employee(); //Estancieie o objeto
		
		System.out.println("Name: ");
		empl.name = input.nextLine();  //invoquei os atributos do objeto
		System.out.println("Gross salary: ");
		empl.grossSalary = input.nextDouble();
		System.out.println("Tax: ");
		empl.tax = input.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + empl); //usei o recurso to string pra nao precisar repetir informações (empl.toString) abreviando (empl)
		System.out.println();
		System.out.println("which percentage to increase salary? ");
		double percentage = input.nextDouble();
		empl.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + empl);
		
		
		input.close();
		
	}

}
