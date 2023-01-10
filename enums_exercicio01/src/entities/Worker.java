package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enuns.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department; // associação
	private List<HourContract> contracts = new ArrayList<>(); // associação "tem muitos", por existir vários contratos nos usamos uma lista.
	// ao gerar os contrutores não incluir nenhum tipo list..
	// é preciso estanciar a lista já aqui na declaração do atributo.
	
	
	public Worker() {
		
	}
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContracts(HourContract contract) {
		contracts.remove(contracts);
	}
	
	public Double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();  // aqui é preciso estanciar um calendário para colocar a data dos contratos nele a cada novo loop uma nova data
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);  // é preciso usar esse (Calendar.YEAR) Para pegar a data do ano
			int c_month = 1 + cal.get(Calendar.MONTH); // é preciso usar esse (Calendar.MONTH) Para pegar a data do mês
			//aqui no c_month é preciso acrescentar + 1 pois o mes no Calendar começa com 0
			if(year == c_year && month == c_month) {
				sum += c.totalValue(); 
			}
		}
		return sum; // é preciso colocar o return fora do loop e if else
	}


	
	

}
