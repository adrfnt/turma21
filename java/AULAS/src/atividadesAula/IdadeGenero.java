package atividadesAula;

import java.util.Scanner;

public class IdadeGenero {

	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
				
		//variables
		int ano,idade,anoAtual=2021; //%d
		char genero; //%c
		String nome; //%s
		
		//input
		System.out.print("Digite seu nome: ");
		nome = read.next();
		System.out.print("Digite seu ano de nascimento: ");
		ano = read.nextInt();
		System.out.print("Digite seu g�nero(M-masc/F-fem/O-outro): ");
		genero = read.next().charAt(0);
		
		idade = anoAtual - ano;
		
		System.out.println();
		System.out.printf(nome+", voce t�m "+ idade +" anos e seu g�nero � "+genero+".");
		System.out.printf("Nome: %s, idade: %d, g�nero: %c"+nome,idade,genero);
		
		read.close();
		
	}
}
