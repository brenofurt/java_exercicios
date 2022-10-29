import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double divisao;
		
		for(int i = 0; i < n; i++) {
			int n1 = sc.nextInt();
			sc.nextLine();
			int n2 = sc.nextInt();
			
			if(n2 == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				divisao = (double)n1 / n2;
			     System.out.printf("%.1f%n", divisao);
			}
		 }
		
        sc.close();
	}

}
