package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		
	}

	public Company(String name, Double anualIncome, Integer numberOfEmplyees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmplyees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmplyees) {
		this.numberOfEmployees = numberOfEmplyees;
	}

	@Override
	public Double tax() {
		double sum = 0.0;
		if(numberOfEmployees >= 10){
			sum = anualIncome * 0.14; 
		}
		else {
			sum = anualIncome * 0.16;
		}
		return sum;
	}
	

}
