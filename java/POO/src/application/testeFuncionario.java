package application;

import Entities.cFuncionario;
import Entities.cTerceiro;

public class testeFuncionario {

		public static void main(String[]args)
		{
			cFuncionario funcionario1 = new cFuncionario("123456798", "JUVENAL" , 50, 20);
			cFuncionario terceiro1 = new cTerceiro("213654","Abracadabra",50,20,10);
			System.out.println(funcionario1);
			funcionario1.mostrarSalario();
			System.out.println(terceiro1);
			terceiro1.mostrarSalario();
			
		}
	}
