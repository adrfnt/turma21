package application;

import java.util.Scanner;

import Entities.Retangulo;

public class CalculoAreas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
			
			Retangulo ret = new Retangulo();
			
			ret.altura = 10;
			ret.base = 5;
			
			ret.area();
			
			leia.close();	
	}
		
}
