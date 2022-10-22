import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double n1, n2, n3;
		
		for(int i = 0; i < n; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
		
			System.out.printf("%.1f%n", media);		
		}
		
		sc.close();
	}

}
