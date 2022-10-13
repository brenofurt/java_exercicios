import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, numeroP1, numeroP2;
		double valorP1, valorP2, total;

		codigo1 = sc.nextInt();
		numeroP1 = sc.nextInt();
		valorP1 = sc.nextDouble();

		codigo2 = sc.nextInt();
		numeroP2 = sc.nextInt();
		valorP2 = sc.nextDouble();

		total = (numeroP1 * valorP1) + (numeroP2 * valorP2);
		System.out.printf("VALOR A PAGAR:%.2f%n", total);
			
		sc.close();

	}

}
