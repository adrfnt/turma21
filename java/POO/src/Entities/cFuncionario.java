package Entities;

public class cFuncionario {

	String matricula;
	String nome;
	int horasTrabalhadas;
	double salarioHora;
	
	@Override
	public String toString() {
		return "Funcionario\nmatricula: " + matricula + "\nnome: " + nome + "\nhorasTrabalhadas: " + horasTrabalhadas
				+ "\nsalarioHora: " + salarioHora;
	}

	public cFuncionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public cFuncionario(String matricula, String nome, int horasTrabalhadas, double salarioHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	
	public void mostrarSalario() {

		System.out.printf("O seu salario é: %.2f", horasTrabalhadas * salarioHora);
	}


}
