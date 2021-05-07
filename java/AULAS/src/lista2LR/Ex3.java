package lista2LR;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0, total21=0, total50=0;
		
			
		while (idade != -99)
		{
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if (idade < 21)
			{
				total21++;

				
			} else if (idade > 50)
			{
				total50++;
			}
		}
		
		System.out.printf("Total de pessoas com menos de 21: %d", total21);
		System.out.printf("\nTotal de pessoas com mais de 50: %d", total50);
		
		leia.close();

	}

}
