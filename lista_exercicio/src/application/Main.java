package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<Employee>(); // estanciei a lista

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (1 + i) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary); // preciso estanciar o novo objeto e passar os agurmentos
			list.add(emp); // Dessa forma eu guardo o objeto dentro da lista
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt(); // aqui precisa ser int primitivo
		Integer pos = position(list, idEmployee);  //essa funçao esta com o argumtento diretamente ligado ao parametro da funçaõ auxiliar position
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			list.get(pos).increasesalary(percent);   // acessa o funcionário que esta no posição pos
		}
		
		
		System.out.println();
		System.out.println("List of employees: "); // pra cada employee emp na minha lista list eu imprimo sysout..
		for (Employee emp : list) { //aqui é preciso usar esse tipo de for colocando a classe, o objeto e a convenção com o list.
			System.out.println(emp);
		}
		
		
	
		
		sc.close();
	}

	    public static Integer position(List<Employee> list, int id) {  // o int daqui não pode ser integer, tem que ser primitivo.
	    	for(int i = 0; i <list.size(); i++) {
	    		if(list.get(i).getId() == id) {
	    			return i;
	    		}
	    	}
	    	return null;
	    }

}
