import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco = 0;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		if(codigo == 1) {  // Estrutura condicional para descobrir o preco utilizando a quantidade e codigo do produto
		    preco = quantidade * 4.00;
		}
		else if(codigo == 2) {
		    preco = quantidade * 4.50;
		}
		else if(codigo == 3) {
		    preco = quantidade * 5.00;				
		}
		else if(codigo == 4) {
		   	preco = quantidade * 2.00;
		}
		else if(codigo == 5) {
			preco = quantidade * 1.50;
		}
		
		System.out.printf("total: %.2f%n", preco);
		
		sc.close();
	}

}
