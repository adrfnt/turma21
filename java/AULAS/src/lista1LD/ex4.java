package lista1LD;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			double num;
						
			System.out.print("Digite um n�mero : ");
			num=leia.nextDouble();
						
			if(num%2==0) {
				System.out.printf("O seu n�mero � par e a raiz dele � %.2f",(Math.sqrt(num)));
			}else {
				System.out.printf("O seu n�mero � impar e o quadrado dele � %.2f",(Math.pow(num, 2.0)));
		}
		leia.close();
	}
}