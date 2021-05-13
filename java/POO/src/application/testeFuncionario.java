package application;

import java.util.Scanner;

import Entities.cFuncionario;  //Exemplo feito em Grupo
import Entities.cTerceiro;

public class testeFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		/*
		 * cFuncionario funcionario1 = new cFuncionario("123456798", "JUVENAL" , 50,
		 * 20); cFuncionario terceiro1 = new cTerceiro("213654","Abracadabra",50,20,10);
		 * System.out.println(funcionario1); funcionario1.mostrarSalario();
		 * System.out.println(terceiro1); terceiro1.mostrarSalario();
		 * System.out.println();
		 */

		System.out.println("Insira o número de matricula: ");
		String matricula = leia.next();
		System.out.println("Insira o nome: ");
		leia.nextLine();
		String nome = leia.nextLine();
		System.out.println("Insira salario: ");
		int horasTrabalhadas = leia.nextInt();
		System.out.println("Insira valor hora: ");
		int salarioHora = leia.nextInt();

		System.out.println();
		cFuncionario terceiro1 = new cTerceiro("213654", "Abracadabra", 50, 20, 10);
		System.out.println(terceiro1);
		terceiro1.mostrarSalario();
		System.out.println();
leia.close();
	}
}
