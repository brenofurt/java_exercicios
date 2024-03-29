package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerhour, Double additionalCharge) {
		super(name, hours, valuePerhour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	

}
