import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int horaI = sc.nextInt();
	    int horaF = sc.nextInt();
	    int duracao;
	    
	    if(horaI < horaF) {    // lógica da condicional para duracao do jogo contabilizando no max 24h.
	    	duracao = horaF - horaI;
	    }
	    else {
	    	duracao = 24 - horaI + horaF;
	    }			
	    
		System.out.println("O jogo durou: " + duracao + " horas.");
	    
		sc.close();

	}

}
