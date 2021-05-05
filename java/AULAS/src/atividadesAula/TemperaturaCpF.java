package atividadesAula;

import java.util.Scanner;

public class TemperaturaCpF {

public static void main (String[] args) {
		
		//instanciar teclado
		Scanner read = new Scanner(System.in);
	
		//variables
		double celsius,f;
		String nome; //s
		
		//input
		System.out.print("Digite seu nome: ");
		nome = read.next();
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = read.nextDouble();
		System.out.println();
		
		//processing
		f = (1.8*celsius) + 32;
		
		//output
		System.out.println("Oi, "+nome+". A temperatura em Fahreheint é :"+f+"°F.");
		System.out.printf("Oi, %s. A temperatura em Farehheint é: %.2f",nome,f);

	
	read.close();
	
	}
}
