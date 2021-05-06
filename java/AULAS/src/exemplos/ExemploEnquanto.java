package exemplos;

import java.util.Scanner;

public class ExemploEnquanto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 1, somatorio = 0, media = 0, totalValoresLidos = 0;
		
		while (numero != 0);{
			System.out.println("Informe um numero positivo: ");
			numero = leia.nextInt();
			
			somatorio = somatorio+numero;
		}
		 if (numero>=0) {
			 totalValoresLidos++; // Inserir else{break;} caso if (numero>0)
		 }
		 
		 	media = somatorio / totalValoresLidos;
		 
		 	System.out.println("\nA soma dos valores informados é de: "+somatorio);
		 	System.out.println("\\nA quantidade de vezes que foram informados numeros !=0 foi de: "+totalValoresLidos);
		 	System.out.println("\nA média dos numeros informados é: "+media);
		
		 	leia.close();
	}
}
	
