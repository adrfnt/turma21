package exemplos;

import java.util.Scanner;

public class CadAluno {
	
	public static void main (String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		String nome="";
		int anoNascimento=0;
		char tipo=' ';
		double salario=0.00;
		//boolean vivo=true;
		
		//entradas
		System.out.println("Digite o nome: ");
		nome = leia.nextLine().toUpperCase();  		//nome � do tipo String
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite M/F/O: ");
		tipo = leia.next().toUpperCase().charAt(0);    //0 � a posi��o vetor
		System.out.println("Digite o sal�rio: ");
		salario = leia.nextDouble();
		
			
		//processamentos
		int idade=(2021-anoNascimento);
				
		//saidas
		System.out.printf("Nome: %s, idade: %d, tipo: %c, sal�rio: %.2f", nome,idade,tipo,salario);
		
		leia.close();
	}

}