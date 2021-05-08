package lista3VM;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números
		 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
		 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
		 * variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
		 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posição 4,
		 * atribuindo a esta posição o valor 100. (d) Mostre na tela cada valor do vetor
		 * A, um em cada linha.
		 */

		int[] A = { 1, 0, 5, (-2), (-5), 7 }; // 6 posições
		int soma = 0;

		soma = A[0] + A[1] + A[5];

		A[4] = 100;

		System.out.println("\nApresentando os valores do vetor A:");

		for (int y = 0; y < 5; y++) {
			System.out.println(A[y]);
		}

		System.out.println("\nA soma dos vetores de posição A[0], A[1] e A[5] é de:" + soma
				+ "\nOBS:Soma das posições anteriores a alteração da posição A[4]");

		leia.close();
	}
}
