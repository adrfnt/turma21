package atividadesAula;

import java.util.Scanner;

public class IR {

	public static void main(String[] args) {
		/*acima de 5000 até 6000 - 15%
		6000 e 10000 - 17%
		acima de 10.000 25%*/
		
		//instanciar teclado
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		String nome; 
		char genero, emergencial;
		double salarioAnual, salarioMes, imposto=0f;
		boolean auxilio;
		
		//entradas
		
		System.out.printf("Por favor, informe seu nome: ");
		nome = leia.nextLine();
		System.out.printf("Infome seu tipo M/F/O: ");
		genero = leia.next().toUpperCase().charAt(0);
		System.out.printf("Você usou auxilio emergencial S/N?: ");
		emergencial = leia.next().toUpperCase().charAt(0);
		System.out.printf("Agora, informe seu Salário Mensal: ");
		salarioMes = leia.nextDouble();
		
		//processamentos e saidas
		if(emergencial == 'S') {
			auxilio = true;
		}else {
			auxilio = false;
		}
			salarioAnual = salarioMes * 12;
		
			if (salarioAnual >= 60000) {
				System.out.println("================================");
				System.out.println("Você deve pagar imposto");
					if(5000 <= salarioMes &&  salarioMes < 6000) {
						//15%
						imposto = salarioAnual * 0.15;
				
						}else if(6000 <= salarioMes && salarioMes < 10000) {
							//17%
							imposto = (salarioAnual * 0.17);
						}else {
							//25%
							imposto = (salarioAnual * 0.25);
						}
					
						System.out.printf("Nome: %s\n", nome);
						System.out.printf("Tipo: %c\n", genero);
						System.out.printf("Salario Anual: %.2f\n", salarioAnual);
						System.out.printf("Imposto: %.2f\n", imposto);
						System.out.println("=====================================");
					
					if(auxilio == true) {
						System.out.println("FRAUDE");
						System.out.println("Devolva R$3.000,00");
					}
					}else {
						if(auxilio == false) {
					
							System.out.println("================================");
							System.out.printf("Nome: %s\n", nome);
							System.out.printf("Tipo: %c\n", genero);
							System.out.printf("Salario Anual: %.2f\n", salarioAnual);
							System.out.printf("Imposot: %.2f\n", imposto);
							System.out.println("você e isente e tem direito a mais um auxilio emergencial.");
						}
							System.out.println("================================");
							System.out.printf("Nome: %s\n", nome);
							System.out.printf("Tipo: %c\n", genero);
							System.out.printf("Salario Anual: %.2f\n", salarioAnual);
							System.out.printf("Imposot: %.2f\n", imposto);
							System.out.println("você e isente e já usou o auxilio emergencial.");
					}
		
		
		leia.close();
		
	}

}
