package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolder = sourceFile.getParent();
		
		boolean success = new File(sourceFolder + "\\out").mkdir();
		
		String targetFileStr = sourceFolder + "\\out\\sumary.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemTxt = br.readLine();
			while(itemTxt != null) {
				String[] vect = itemTxt.split(",");
				String name = vect[0];
				double price = Double.parseDouble(vect[1]);
				int quantity = Integer.parseInt(vect[2]);
				list.add(new Product(name, price, quantity));
				itemTxt = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for(Product item : list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.getPrice()) + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}
			} catch (IOException e) {
				System.out.println("Error, " + e.getMessage());
			}
		
		}catch (IOException e) {
			System.out.println("Error, " + e.getMessage());
		}
		
		
		sc.close();
	}

}
