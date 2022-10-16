import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);
        
		int a;
		int b;
		int soma;
		int a2;
		int b2;
		int soma2;
		int a3;
		int b3;
		int soma3;
		
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		a2 = sc.nextInt();
		b2 = sc.nextInt();
		soma2 = a2 + b2;
		
		a3 = sc.nextInt();
		b3 = sc.nextInt();
		soma3 = a3 + b3;
		
		System.out.println("SOMA (1) = " + soma);
		System.out.println("SOMA (2) = " + soma2);
		System.out.println("SOMA (3) = " + soma3);
		
		
		sc.close(); 

	}

}
