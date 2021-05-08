package lista3VM;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis 
		int [][] matriz = new int [3][3];
		int maioresQue10=0;
		
		
		System.out.println("Matriz M[3][3] \n");
		
		//entrada de dados
		for (int linha=0; linha < 3; linha++)
		{
			for(int coluna=0; coluna<3; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",(linha+1), (coluna+1));
				matriz [linha][coluna] = leia.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					maioresQue10++;
				}
			}
			
		}
		
		System.out.println();
		System.out.println("Resultado da Matriz:\n");
		
		for (int linha=0; linha < 3; linha++)
		{
			for(int coluna=0; coluna<3; coluna++)
			{
				System.out.printf("\t %d \t", matriz[linha][coluna], "\n\n");
				
			}
			System.out.println();
		}
		
		
		System.out.printf("\nForam informados: %d números maiores que 10", maioresQue10);
		
		leia.close();

	}

}
