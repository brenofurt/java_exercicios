package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double initialDeposit;

	public Account(int accountNumber, String accountHolder) {  // 1 - fazer o contrutor
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public Account(int accountNumber, String accountHolder, double initialDeposit) { //construtor
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {  // 2 - logo após fazer o get and set
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() { 
		return accountHolder;
	}

	public double getBalance() {
		return initialDeposit;
	}

	public void deposit(double amount) { // 3 - criar os métodos 
		initialDeposit += amount;
	}
	
	public void withdraw(double amount) {
		initialDeposit -= amount + 5.00;
	}
	
	public String toString() {   // 6.1 criar o método toString
		return "Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + String.format("%.2f", initialDeposit);
	}
	
	

}
