package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara { 
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final int HABITANTES = 3;
		int filho;
		double totalFilho = 0;
		double medFilho;
		double salario;
		double totalSalario = 0;
		double medSalario;
		double maior = 0;
		double salarioAteCem = 0;
		double porcentagem;
		
		for (int indice = 0; indice < HABITANTES; indice++) {
			System.out.println("Habitante : " + (indice+1));
			System.out.printf("Digite seu salário: ");
			salario = leia.nextDouble();
			System.out.printf("Digite número de filhos: ");
			filho = leia.nextInt();
			
			totalFilho += filho; //totalFilho=totalFilho+filho
			totalSalario += salario; //totalSalario=totalSalario+salario
			
			if (salario > maior) {
				maior = salario;
			}
			if ( salario <= 100 ) {
				salarioAteCem++;  //salarioAteCem=salarioAteCem+1
			}
		}
		
		porcentagem = ((salarioAteCem / HABITANTES) * 100);
		medFilho = (totalFilho / HABITANTES);
		medSalario = (totalSalario / HABITANTES);
		
		System.out.printf("\nMaior salario %.2f", maior);
		System.out.printf("\nMédia salarial %.2f", medSalario);
		System.out.printf("\nMédia filhos %.2f", medFilho);
		System.out.printf("\nPercentutal Salario até R$ 100 %.2f%%", porcentagem);
		
		leia.close();
	}

}
