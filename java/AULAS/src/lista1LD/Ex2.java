package lista1LD;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3;
	 
		
		System.out.println("Digite o primeiro numero: ");
		numero1=leia.nextInt();
				
		System.out.println("Digite o segundo numero: ");
		numero2=leia.nextInt();
				
		System.out.println("Digite o terceiro numero: ");
		numero3=leia.nextInt();

		if ((numero1<numero2) && (numero1<numero3) && (numero2<numero3)){
			System.out.printf("A ordem crescente é: ",numero1,numero2,numero3);
		}
		
		else if ((numero2<numero1) && (numero2<numero3) && (numero1<numero3)) {
			System.out.printf("A ordem crescente é: ",numero2,numero1,numero3);
		}
		
		else if ((numero3<numero1) && (numero3<numero2) && (numero2<numero1)) {
			System.out.printf("A ordem crescente é: ",numero3,numero2,numero1);
		}
		else if ((numero1<numero2) && (numero3<numero2) && (numero1<numero3)) {
			System.out.printf("A ordem crescente é: ",numero1,numero3,numero2);
		}
		leia.close();
	}
		
}