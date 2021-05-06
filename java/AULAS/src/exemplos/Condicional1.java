package exemplos;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int i;
		String nome;
		
		System.out.printf("Entre com sua idade: ");
		i=leia.nextInt();
		leia.nextLine();
		System.out.printf("Entre com seu nome: ");
		nome=leia.nextLine();
		System.out.printf("Seu nome: %s \n",nome); //%string
		System.out.printf("Sua idade: %d ",i); //%d inteiro
		
		if(i >=18){
			System.out.printf("\nVocê é maior de idade...");
		}
		else if(i>=1 && i<18) {
			System.out.printf("\nVocê é menor de idade...");
		}
		else {
			System.out.printf("\nVocê entrou com uma idade inválida.");
		}		
		leia.close();		
	}

}
