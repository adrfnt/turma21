package exemplos;

//import java.util.Locale;
import java.util.Scanner;

public class Enquanto {
	
	public static void main(String[] args) {
			
			//Locale.setDefault(Locale.US); padr�o americano		
			Scanner leia = new Scanner(System.in);
			
			double numero = 0, total = 0, med = 0;
			int contador = 0;

			
			while (numero >= 0) {
				total += numero;
				contador++;
				
				System.out.printf("Digite um n�mero positivo ou negativo p/ sair: ");
				numero =leia.nextDouble();

			}
			
			med = total / contador;
			System.out.println("Soma total: " + total);
			System.out.println("M�dia: " + med);
			System.out.println("Total valores lidos: " + contador);
			
			leia.close();
			
		}
	}
