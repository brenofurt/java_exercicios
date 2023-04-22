package services;

public class UsaInterestService implements InterestService {
	
	private double interestRate;
	
	public UsaInterestService() {
		
	}

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

	/* No caso do método getInterestRate() eu não posso colocar ele  diretamente na interface
	  pois depende do valor da variável interestRate que esta armazenada nessa classe do tipo específica */
	

	
	
	
	

}
