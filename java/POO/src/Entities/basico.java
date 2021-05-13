package Entities;

public class basico extends estudante {
	
	//atributo
	private int diaAniversario;

	//construtor
	public basico(String nome, int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}
	
	//sobrecarga
	public basico(int matricula, String cpf, boolean status, int diaAniversario) {
		super(matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}
	
	//encapsulamento
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//método
	public void bonusAniversario(int dia) {
		if(diaAniversario ==dia) {
			super.adicionarNota((super.getPontos()*0.1));
		}
	}
	
}
