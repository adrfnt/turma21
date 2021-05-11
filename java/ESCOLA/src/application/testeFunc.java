package application;

import Entities.funcionario;

public class testeFunc {

	public static void main(String[] args) {
		funcionario func = new funcionario();
		func.setNome("ana");
		func.setSalario(2500);

		System.out.println(func.getNome()+"\n"+func.getSalario());
	}

}
