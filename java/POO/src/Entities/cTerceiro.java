package Entities;

public class cTerceiro extends cFuncionario {

	@Override
	public String toString() {
		return "Dados do terceiro" + "\n\nMatricula: " + super.matricula + "\nHoras Trabalhadas: "
				+ super.horasTrabalhadas + "\nNome: " + super.nome + "\nSalario hora: " + super.salarioHora
				+ "\nadicional: " + adicional;
	}

	private double adicional;

	public cTerceiro(String matricula, String nome, int horasTrabalhadas, double salarioPorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, salarioPorHora);
		this.adicional = adicional;
		// TODO Auto-generated constructor stub
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public void mostrarSalario() {
		System.out.printf("O seu salario é: %.2f", (horasTrabalhadas * salarioHora) + adicional);
	}

}
