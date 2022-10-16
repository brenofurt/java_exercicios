import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        int  n, m;
        
        n = sc.nextInt();
        if(n < 0) {  // condicional composta.
           System.out.println("NEGATIVO");	
        }
        else {
           System.out.println("POSITIVO");
        }
        
        m = sc.nextInt();
        
        System.out.println((m < 0) ? "NEGATIVO" : "POSITIVO");    // Expressão condicional ternária
        
	
        sc.close();	
	
	}

}
