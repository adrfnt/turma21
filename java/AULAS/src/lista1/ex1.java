package lista1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int numero1, numero2, numero3;
		
		//entrada
		System.out.print("Insira o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.print("Insira o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.print("Insira o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		//saida
		if (numero1 > numero2 && numero1 > numero3){
			System.out.println("\nO primeiro n�mero � o maior:"+numero1);
		}		
		else if(numero2 > numero1 && numero2 > numero3){
			System.out.println("\nO segundo n�mero � o maior:"+numero2);
		}
		else if(numero3 > numero1 && numero3 > numero2) {
			System.out.println("\nO terceiro n�mero � o maior: "+numero3);
		}
		
		leia.close();		
	}

}
