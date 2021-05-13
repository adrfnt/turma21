package Entities;

public class terc extends func {
	private double adicional;

	public terc(String nome, String matricula, int horasTrabalhadas, double valorHoras, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorHoras);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override     //copia cola da classe mãe (terceiro filho de funcionário)
	public double mostrarSalario() {
		return (horasTrabalhadas*valorHoras)+adicional;
		//return(super.gethorasTrabalhadas()*super.getvalorHoras())+adicional;
	}
}
