package ProjetoJava;

import java.util.Scanner;

public class bonusGraduacao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("\n Digite o nome do aluno: ");
		String nome = leia.next().toUpperCase();
		System.out.print("Digite o n da matricula: ");
		int matricula = leia.nextInt();
		System.out.print("Digite o cpf: ");
		String cpf = leia.next();
		System.out.print("Digite o dia de aniversário");
		int dia = leia.nextInt();
		System.out.print("Digite a nota inicial: ");
		double nota = leia.nextDouble();

		Basico aluno1 = new Basico(matricula, cpf, dia);
		Graduacao grad1 = new Graduacao(matricula, cpf);
		aluno1.setNome(nome);
		aluno1.adicionarNota(nota);
		grad1.adicionarNota(10);

		char op = ' ';
		System.out.println("Nota do grad 1: " + grad1.getPontos());
		for (int x = 1; x <= 3; x++) {

			System.out.println("Informe o valor: ");
			nota = leia.nextDouble();
			System.out.println("Digite 1- adcionar nota ou 2-debitar: ");
			op = leia.next().charAt(0);
			if (op == '1') {
				grad1.adicionarNota(nota);
			} else {
				grad1.tirarNotas(nota);
			}
			System.out.println("Valor atual do bônus: " + grad1.getBonus());
			System.out.println("Novo saldo de nota de grad 1: " + grad1.getPontos());
			leia.close();
		}

	}

}	