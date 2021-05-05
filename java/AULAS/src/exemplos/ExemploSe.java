package exemplos;

/*import java.util.Locale;*/
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US); padrão americano
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		/*se((numero%2)==0){
			escreva("numero par")
			}
		*/
		
		if (numero==0 ) {
			System.out.print("Zero é neutro!");
		}
		else if (numero<0) {
			System.out.print("Número negativo!");
		}
		else if ((numero%2)==0){
			System.out.println("O número é par!");
		}
		else {
			System.out.println("O número é impar!");
		}
		leia.close();
	}

}
