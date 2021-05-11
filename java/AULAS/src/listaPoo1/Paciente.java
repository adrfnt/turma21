package listaPoo1;

import java.util.Scanner;

public class Paciente {
	
public static void main(String[] args) {
 		
 		Scanner leia = new Scanner(System.in);
 		ClassePaciente paciente= new ClassePaciente();
	
 		System.out.print("Qual seu nome? ");
		paciente.nome = leia.nextLine();
		
		System.out.print("Qual documento? ");
		paciente.documento = leia.nextLine();
		
		System.out.print("Possui convênio? [1 - Sim | 2 - Não] ");
		paciente.tipo = leia.nextInt() == 1 ? true : false; //tenário
		
		leia.close();
	}
}
