package lista0VO;

import java.util.Scanner;

public class L1ex1 {
 
	public static void main(String[] args) {
		
		//instanciando
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int idadeAnos, idadeMeses, idadeDias, TotalDias;
		
		//entradas
		System.out.println("Qual sua idade em anos?: ");
		idadeAnos = leia.nextInt();
		System.out.println("E quantos meses?: ");
		idadeMeses = leia.nextInt();
		System.out.println("E quantos dias?: ");
		idadeDias = leia.nextInt();
		
		//processamento
		TotalDias = (idadeAnos*365) + (idadeMeses*31) + (idadeDias);
		
		//saida
		System.out.printf("Sua idade em dias é de: "+TotalDias+" dias");
		
		leia.close();
		
	}	
}
	
	
