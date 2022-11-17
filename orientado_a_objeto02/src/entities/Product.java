package entities;

public class Product {

	public String name;   // Atributos
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {  // Métodos
		this.quantity += quantity;	
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, total: $ " + String.format("%.2f", totalValueInStock());
	}
}
