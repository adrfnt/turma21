package exemplos;

import java.util.Scanner;

public class ExemploFacaEnquanto {

			public static void main(String[] args) {
				
				Scanner leia = new Scanner (System.in);
				int numero=233;
				
				do {
					if (numero >=300 && numero <= 400)
					{
						System.out.print(numero + " +3 = ");
						numero +=3; 
						System.out.println(numero);
					}
					
					if(numero >= 233 && numero < 300 || numero > 400 && numero < 456)
					{
						System.out.print(numero + " +5 = ");
						numero +=5; 
						System.out.println(numero);
					}	
				

			} while (numero >= 233 && numero < 456);
		leia.close();
		}

}

