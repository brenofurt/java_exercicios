package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100, months);
	}
	
	/* aqui eu estou tendo uma implementação do método de pagamento, já na interface com o método payment e 
	evitando a repetição de código nas classes concretas (específicas) */

	// interface não pode ter construtor nem atributos que armazem dados.
}
