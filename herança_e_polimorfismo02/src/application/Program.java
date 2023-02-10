package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			System.out.println("Product #" + (i+1) + "data:");
			System.out.print("Common, used or imported? (c/u/i)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			if(resp == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				Product product = new Product(name, price);
				products.add(product);
			}
			else if(resp == 'u') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf2.parse(sc.next());
				products.add(new UsedProduct(name, price, manufactureDate));
			}
			else if (resp == 'i'){
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("customs fee: ");
				Double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
			

			}
			
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product prod : products) {
			System.out.println(prod.priceTag());	
		}
		
		sc.close();
	
	}

}
