package lista2LR;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, somaPar=0, somaImpar=0;
		
		for(int n=0;n<10;n++) {
			System.out.print("Insira um número: ");
			numero = leia.nextInt();
				if((numero%2)==0)
				{
					somaPar++;
				}
				else 
				{
					somaImpar++;
				}
				
			}
			System.out.printf("Quantidade de números pares: %d",somaPar);	
			System.out.printf("\nQuantidade de números ímpares: %d",somaImpar);	
			
			leia.close();
			}
		}