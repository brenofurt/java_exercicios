package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entitites.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		String path = "C:\\Users\\Yasmim\\teste\\Employee.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeTxt = br.readLine();
			while (employeeTxt != null) {
				String[] fields = employeeTxt.split(",");
				Employee emp = new Employee(fields[0], Double.parseDouble(fields[1]));
				employees.add(emp);
				employeeTxt = br.readLine();
			}
			
			Collections.sort(employees);
			for (Employee employee : employees) {
				System.out.println(employee.getName() + ", " + String.format("%.2f", employee.getSalary()));
			}
			
			
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
