package lista2LR;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner (System.in);
		int numero = 0, somaTotal = 0;

		do 
		{

			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			somaTotal+=numero;
		}
		while((numero%2)!=0);
		
		System.out.printf("A soma dos n�meros digitados �: %d",somaTotal);
		
		leia.close();
	}
}