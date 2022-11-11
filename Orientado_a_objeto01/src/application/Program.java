package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();  // Estanciando o objeto
		y = new Triangle();		
		
		System.out.println("Enter the measures of triangle x: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area(); // Método
	
		double areaY = y.area(); // Método
		
		System.out.printf("triangle x area: %.4f%n", areaX);
		System.out.printf("triangle y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: x");
		}
		else {
			System.out.println("Larger area: y");
		}
		
		sc.close();

	}

}
