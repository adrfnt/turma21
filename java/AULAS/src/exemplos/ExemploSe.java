package exemplos;

/*import java.util.Locale;*/
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US); padr�o americano
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		/*se((numero%2)==0){
			escreva("numero par")
			}
		*/
		
		if (numero==0 ) {
			System.out.print("Zero � neutro!");
		}
		else if (numero<0) {
			System.out.print("N�mero negativo!");
		}
		else if ((numero%2)==0){
			System.out.println("O n�mero � par!");
		}
		else {
			System.out.println("O n�mero � impar!");
		}
		leia.close();
	}

}
