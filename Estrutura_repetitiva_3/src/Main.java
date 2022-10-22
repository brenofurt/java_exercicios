import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool, gasolina, diesel, n = sc.nextInt();
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		while(n != 4) {
			if(n == 1) {
				alcool += 1;
			}
			else if(n == 2) {
				gasolina += 1;
			}
			else if(n == 3) {
				diesel += 1;
			}
			
			n = sc.nextInt();		
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Alcool " + alcool);
		System.out.println("Alcool " + gasolina);
		System.out.println("Alcool " + diesel);

		sc.close();
	}

}
