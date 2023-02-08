package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();  
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			if(resp == 'y') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per hour? ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee outsourcedemployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge); //aqui esta acontecendo um upcasting
				emp.add(outsourcedemployee);
			}
			else {		
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.println("Value per hour? ");
			Double valuePerHour = sc.nextDouble();
			Employee employee = new Employee(name, hours, valuePerHour);
			emp.add(employee);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee empl : emp) {
			System.out.println(empl.getName() +  "- $ " + String.format("%.2f", empl.payment()));
		}
	
		sc.close();
	
	}

}
