import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTri, areaTra, areaCir, areaQua, areaRet, pi;
		pi = 3.14159;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		areaTri = (A * C) / 2;
		areaCir = pi * C * C;
		areaTra = ((A + B) * C) / 2;
		areaQua = B * B;
		areaRet = A * B;

		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCir);
		System.out.printf("TRAPEZIO: %.3f%n", areaTra);
		System.out.printf("QUADRADO: %.3f%n", areaQua);
		System.out.printf("RETANGULO: %.3f%n", areaRet);

		sc.close();

	}

}
