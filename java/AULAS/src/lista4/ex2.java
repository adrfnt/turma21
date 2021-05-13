package lista4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero[] = new int[6];
		int par[] = new int[6];
		int impar[] = new int [6];
		int somaPares =0; 
		int quantidadeImpares = 0;
			
			for(int x=0;x<6;x++){
			System.out.println("Digite um número inteiro: ");
			numero[x] = leia.nextInt();
			
						
			if(numero[x] % 2 == 0) {
				somaPares = (somaPares + numero[x]);
				par[x] = (numero[x]);
			}
			else {
				quantidadeImpares++;
				impar[x] = (numero[x]);
			}
			
			}
			System.out.print("\nnumeros pares");	
			for (int i: par) {
				
				if (i != 0) {
					System.out.printf(" %d ", i);	
				}
			}
			
			System.out.print("\nnumeros impares");
			
			for (int i: impar) {
				
			
				if (i !=0) {
				System.out.printf(" %d ", i);
			}
			}
			
			System.out.printf("\nA soma dos pares é %d", somaPares);
			
			System.out.printf("\nA quantidade de impares é %d", quantidadeImpares);
			leia.close();
	}

}
