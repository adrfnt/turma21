package Entities;

public class terceiro extends funcionario {
	
	private double adicional;

  	public terceiro(String nome, String matricula, int horasTrabalhadas, double valorHora, double adicional) { //construtor usando todas as informa��e, a sobrecarga
		super(nome, matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    
    @Override
    public double salario(){
        
        return (horasTrabalhadas*valorHora)+adicional;
    }    
	
	/*@Override     //copia cola da classe m�e (terceiro filho de funcion�rio)
	public double salario() {
		return (horasTrabalhadas*valorHora)+adicional;
		//return(super.gethorasTrabalhadas()*super.getvalorHoras())+adicional;
	}*/
}
