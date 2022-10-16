import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		n = sc.nextInt();
		
		if(n % 2 == 0) {  // Expressao condicional composta
			System.out.println("PAR"); 
		}
		else {
			System.out.println("IMPAR");
		}
		
		m = sc.nextInt();
		
		System.out.println((m % 2 == 0) ? "PAR" : "IMPAR"); // Expressao condicional ternaria
		
		sc.close();
        
	}

}
