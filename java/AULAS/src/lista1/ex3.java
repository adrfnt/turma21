package lista1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int idade;
		
		//entrada
		System.out.print("Qual � a sua idade? ");
		idade = leia.nextInt();
		
		//processamento e saida
		
		if (idade <= 10) {
			System.out.println("Voc� est� em outra categoria");
		}		
		else if(idade > 10 && idade <=14 ) {
			System.out.println("Voc� est� na categoria Infantil");
			} 
		else if (idade > 15 && idade <= 17) {
			System.out.println("Voc� est� na categoria Juvenil");
		} 
		else if (idade > 18 && idade <= 25) {
			System.out.println("Voc� est� na categoria adulto");
		} 
		else if (idade >=26){
			System.out.println("Voc� est� em outra categoria");
		}
				
		leia.close();
	}
	
}