package lista4;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * 1- Fa?a um programa que possua um vetor denominado A que armazene 6 n?meros
		 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
		 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
		 * vari?vel inteira (simples) a soma entre os valores das posi??es A[0], A[1] e
		 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posi??o 4,
		 * atribuindo a esta posi??o o valor 100. (d) Mostre na tela cada valor do vetor
		 * A, um em cada linha.
		 */

		int[] A = { 1, 0, 5, (-2), (-5), 7 }; // 6 posi??es
		int soma = 0;

		soma = A[0] + A[1] + A[5];

		A[4] = 100;

		System.out.println("\nApresentando os valores do vetor A:");

		for (int y = 0; y < 5; y++) {
			System.out.println(A[y]);
		}

		System.out.println("\nA soma dos vetores de posi??o A[0], A[1] e A[5] ? de:" + soma
				+ "\nOBS:Soma das posi??es anteriores a altera??o da posi??o A[4]");

		leia.close();
	}
}
