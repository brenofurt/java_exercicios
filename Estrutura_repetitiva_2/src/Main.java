import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 || y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");	
			}
			else if(x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else {
				System.out.println("Terceiro");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
	
		
		
		
		sc.close();
	}

}
