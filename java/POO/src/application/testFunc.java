package application;

import Entities.func;
import Entities.terc;

public class testFunc {

	public static void main(String[] args) {
		
		func func1 =new func("ana", "x01", 10, 20.00);
		func func2 =new terc("vic", "x02", 10, 20.00, 15.00);
		System.out.println(func1.mostrarSalario());
		System.out.println(func2.mostrarSalario());
	}

}
