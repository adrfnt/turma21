package listaPoo1;

import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ClasseCliente cliente1 = new ClasseCliente();
		ClasseCliente cliente2 = new ClasseCliente();
				
		System.out.println("Digite o nome do primeiro cliente: ");
		cliente1.nome = leia.next();
		System.out.println("Digite o ano de nascimento do primeiro cliente: ");
		cliente1.anoNasc = leia.nextInt();
		System.out.println("Digite o documento do primeiro cliente? ");
		cliente1.doc = leia.nextInt();
				
		System.out.println("Digite o nome do segundo cliente: ");
		cliente2.nome = leia.next();
		System.out.println("Digite o ano de nascimento do segundo cliente: ");
		cliente2.anoNasc = leia.nextInt();
		System.out.println("Digite o documento do primeiro segundo? ");
		cliente2.doc = leia.nextInt();
		
		System.out.printf("Primeiro cliente %s tem %d anos e documento: %d",cliente1.nome,cliente1.calculaIdade(2021), cliente1.doc);
		System.out.printf("\nSegundo cliente %s tem %d anos e documento: %d",cliente2.nome,cliente2.calculaIdade(2021), cliente2.doc);
		
		leia.close();
	}

}