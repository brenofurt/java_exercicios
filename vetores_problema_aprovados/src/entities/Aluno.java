package entities;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	private double media;
	
	public Aluno(String nome, double nota1, double nota2, double media) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}


	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	

}
