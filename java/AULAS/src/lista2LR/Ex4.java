package lista2LR;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
			
		/*Uma empresa desenvolveu uma pesquisa para saber as características
		*psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
		*idade, genero (1-feminino / 2-masculino / 3-Outros), e as opçõe:
		*(1, se a pessoa era calma; 
		*2, se a pessoa era nervosa 
		*3, se a pessoa era *agressiva)
		* Pede-se para elaborar um sistema que permita ler os dados de 150
		*pessoas, calcule e mostre: (WHILE)
		-o número de pessoas calmas;
		-o número de mulheres nervosas;
		-o número de homens agressivos;
		-o número de outros calmos;
		-o número de pessoas nervosas com mais de 40 anos;
		-o número de pessoas calmas com menos de 18 anos.*/
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); //construtor
		
		final int PESSOAS = 150;
		int contador = 1;
		int idade = 0;
		char continua ='S';
		char genero; //(1-feminino / 2-masculino / 3-Outres)
		char opcao; //caracteristicas (1 calma; 2, nervosa 3, agressiva)
		int pessoasCalmas = 0;			
		int mulheresNervosas = 0;		
		int homensAgressivos = 0;
		int outrosCalmos = 0;		
		int pessoasNervosasAcima40 = 0; 
		int pessoasCalmasMenor18 = 0;
		
		
		
		while(continua=='S'&& contador <=PESSOAS){
			System.out.printf("Pessoa %d \n",contador);
			System.out.printf("Informe idade: ");
			idade = leia.nextInt();
			System.out.printf("Informe 1-feminino / 2-masculino / 3-Outres: ");
			genero = leia.next().charAt(0);
			System.out.printf("Selecione a opção 1-calmo, 2-nervoso, 3-agressivo: ");
			opcao = leia.next().charAt(0);
			
			if(opcao=='1') {
				pessoasCalmas++; 
			}
			if(genero=='1' && opcao =='2') { 
				 mulheresNervosas++;
			 }
			if(genero =='2' && opcao =='3') {
				homensAgressivos++;
			}
			if(genero=='3' && opcao=='1') {
				outrosCalmos++;
			}
			if(opcao=='2' && idade>40) {
				pessoasNervosasAcima40++;
			}
			if(opcao =='1' && idade<18) {
				pessoasCalmasMenor18++;
			}
			
			System.out.printf("Total de pessoas calmas: %d\n",pessoasCalmas);
			System.out.printf("Total de mulheres nervosas: %d\n",mulheresNervosas);
			System.out.printf("Total de homens agressivos: %d\n",homensAgressivos);
			System.out.printf("Outros calmos: %d\n",outrosCalmos);
			System.out.printf("Total de pessoas nervosas com mais de 40 anos: %d\n",pessoasNervosasAcima40);
			System.out.printf("Total de pessoas calmas com menos de 18 anos: %d\n",pessoasCalmasMenor18);
			
			//saida do loop - while
			System.out.println("Continua S/N? ");
			continua = leia.next().toUpperCase().charAt(0);
			contador++;
		}
		System.out.println("Fim do programa!");
	leia.close();	
	}

}
