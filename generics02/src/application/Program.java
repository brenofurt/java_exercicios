package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {
		

		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\Yasmim\\teste\\Problema.txt";
				
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			
			String line = bf.readLine();
			while(line != null) {
				String[] field = line.split(",");
				Product product = new Product(field[0], Double.parseDouble(field[1]));
				list.add(product);
				line = bf.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Max:");
			System.out.println(x);
		
		}
		catch (IOException e) {
			System.out.println("Error, " + e.getMessage());
		}

	}

}
