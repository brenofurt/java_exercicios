package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Student stud = new Student();
	
		System.out.println("Student name: ");
		stud.name = input.nextLine();
		stud.grade1 = input.nextDouble();
		stud.grade2 = input.nextDouble();
		stud.grade3 = input.nextDouble();
		System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());
		if(stud.finalGrade() > 60.00) {  //observar que é possivel usar o método na condicional.
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING: %.2f POINTS", stud.missing());
		}

		input.close();
	}

}
