package listaPoo1;

import java.util.Scanner;

public class Aviao {
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	ClasseAviao passageiro1 = new ClasseAviao();
	ClasseAviao passageiro2 = new ClasseAviao();
	
		
	System.out.println("Qual seu primeiro nome? ");
	passageiro1.primeiroNome = leia.next();		
	System.out.println("Qual seu último nome? ");
	passageiro1.sobrenome = leia.next();		
	System.out.println("Qual seu destino? ");
	passageiro1.destino = leia.next();
	
	System.out.println("Qual seu primeiro nome? ");
	passageiro2.primeiroNome = leia.next();
	System.out.println("Qual seu último nome? ");
	passageiro2.sobrenome = leia.next();
	System.out.println("Qual seu destino? ");
	passageiro2.destino = leia.next();
	
	System.out.printf("%s viajará para %s", passageiro1.nomeCompleto(), passageiro1.destino);
	System.out.printf("\n%s viajará para %s", passageiro2.nomeCompleto(), passageiro2.destino);

	leia.close();
	}
}
