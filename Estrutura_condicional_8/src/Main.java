import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double taxa;
		

		if (salario <= 2000.0) {  // ap. para calcular imposto de renda
			taxa = 0.0;
		}
		else if(salario <= 3000.0) {
			taxa = (salario - 2000.0) * 0.08;
		}
		else if(salario <= 4500.0) {
			taxa = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			taxa = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08 ;
		}
		
		if(taxa == 0.0) {
			System.out.println("Insento");
		}
		else
			System.out.printf("%.2f%n", taxa);
		
		sc.close();

	}

}
