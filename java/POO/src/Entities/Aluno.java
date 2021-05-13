package Entities;

public class Aluno {
	
	// atributos: �, tem ou est�
	public int matricula;
	public String cpf;
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean ativo;
	
	//Construtor - pq tem o mesmo nome da classe - APENAS P/ TESTE PROGRAMADOR 
	public Aluno (int matricula, String cpf, String nome) {
		
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//Sobrecarga de m�todo 
	public Aluno (int matricula, String nome) {
		
		this.matricula = matricula;
		this.nome = nome;
	}
	
	//metodos - comportamento: faz, a��o
	
	public void mostrarIdade() {
		System.out.println("A idade � "+(2021-anoNascimento));
	}
	//sobrecarga
	public void mostrarIdade(int anoAtual) {
		System.out.println("A idade �"+(anoAtual-anoNascimento));
	}
}
