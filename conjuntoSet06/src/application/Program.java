package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		Set<Integer> setC = new HashSet<>();
		
		
		System.out.print("How manny students for course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			setA.add(number);
		}
		
		System.out.print("How manny students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			setB.add(number);
		}
		
		System.out.print("How manny students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			setC.add(number);
		}
		
		Set<Integer> total = new HashSet<>(setA);
		total.addAll(setB);
		total.addAll(setC);
		
		System.out.print("Total students: " + total.size());
		
		
		
		sc.close();

	}

}
