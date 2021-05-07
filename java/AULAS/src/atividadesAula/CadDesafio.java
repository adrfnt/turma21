package atividadesAula;

import java.util.Locale;
import java.util.Scanner;

public class CadDesafio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		String alunos[] = { "Alexandre Salerno", "Alexsander da Silva Sousa", "Aline Moreira Brilhante",
				"Ana Flávia Porto Silva Neves", "Andára Finot da Silva", "arthur reis allen", "Barbara dos Santos",
				"Bruno Wesley Callachi Rocha", "Dafhne Noemi da Silva Novais", "David da Costa Mariano",
				"Elielthon Soares de Souza", "Erika Rosany de Almeida Lima", "Fabricio Siqueira Macedo",
				"Fernando Salomão Constancio", "Giovanna Cirillo Torres", "Guilherme Mendes Carvalho",
				"Guilherme Monteiro Lopes", "Isabelli Santos Silva", "Israel Dantas da Silva", "Jessica Yuki Toyota",
				"Jonatas Michel de Cardoso Vieira", "José Luis Correia dos Santos", "Juliana Brito Favero Ribeiro",
				"Lorrans Matildes Facca", "Lucas Teodoro de Sousa", "Maria Luísa Maricato",
				"Mateus Rosendo Firmino de Oliveira", "Matheus de Souza Barbosa", "Nathalia Beatriz Silva Pereira",
				"Pedro Henrique de Azevedo Magalhães", "Renato Novais da Silva", "Renato Yukio Ossiama Nakamura",
				"Robson de Jesus Vasconcelos", "Tainah Vinha", "Vinicius Martins Santos" };
		int notas[] = new int[2];
		int matriculas[] = new int[2];
		char sim = 's';

		for (int x = 0; x < 3; x++) {
			System.out.println("Digite Matricula do aluno");
			matriculas[x] = leia.nextInt();

			if (matriculas[x] != 0) {
				System.out.printf("\nAluno %s Digite a nota:", alunos[x]);
				notas[x] = leia.nextInt();

				System.out.println("Digite Sim para continuar ");
				sim = leia.next().toUpperCase().charAt(0);
			}
			if (sim == 'S') {

			} else {
				break;

			}

		}

		System.out.println("Lista de  notas %d");
		leia.close();
	}

}