package application;

import java.util.Scanner;

public class testeErro {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor;
		String nomes [] = new String[3];
		
		try {
			System.out.println("Digite o numero da posição [1 a 3] para cadastrar o nome: ");
			valor = leia.nextInt();
			System.out.println();
			nomes[valor] = leia.next().toUpperCase();	
			System.out.println(nomes[valor]);
		}
		catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Vc colocou um tamanho de vetor maior que o atual!");
		}
		System.out.println("Fim de programa!");
			
	}

}
