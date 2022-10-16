import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, horas;
		double preco, salario;
		

		n = sc.nextInt();
		horas = sc.nextInt();
		preco = sc.nextDouble();
		
		salario = horas * preco;

		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
