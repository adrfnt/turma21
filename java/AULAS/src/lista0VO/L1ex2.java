package lista0VO;

import java.util.Scanner;

public class L1ex2 {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int idade, dias, ano, meses;
		
		//entrada
		System.out.println("Quantos dias você viveu? ");
	    idade=leia.nextInt();
	    
	    //processamento
	    ano = (idade / 365);
	    meses = ((idade%365) / 30); 
		dias = ((idade%365) % 30);
		
		//saida
		System.out.println("ano(s): "+ano);
		System.out.println("mes(es): "+meses);
		System.out.println("dia(s): "+dias);
		
		leia.close();	
	}


}