package entities;

public class Triangle {  //classe criada

	public double a;
	public double b;
	public double c;
	
	public double area() { // Método criado
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
	
	
}
