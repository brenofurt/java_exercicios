package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("Tv", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod)); //Pra testar se contem o mesmo produto no conjunto é preciso estanciar um objeto Product e implementar o hash code e equals na classe Product
		
		/*for(Product p : set) {
			System.out.println(p);
		} */

	}

}
