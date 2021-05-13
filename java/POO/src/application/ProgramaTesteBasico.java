package application;

import java.util.Scanner;
import Entities.basico;

public class ProgramaTesteBasico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome");
		String nome = leia.next();
		System.out.println("Digite o numero da matricula");
		int matricula = leia.nextInt();
		System.out.println("Digite o cpf");
		String cpf = leia.next();
		System.out.println("Digite o dia de aniversário");
		int dia = leia.nextInt();
		System.out.println("Digite nota inicial");
		double nota = leia.nextDouble();

		basico aluno1 = new basico(nome, matricula, cpf, dia);

		aluno1.setNome(nome);
		aluno1.adicionarNota(nota);
		System.out.printf("Pontos atuais do aluno %s = %.0f \n", aluno1.getNome(), aluno1.getPontos());
		System.out.println("Digite o dia atual :");
		int diaAtual = leia.nextInt();
		aluno1.bonusAniversario(diaAtual);
		System.out.printf("Pontos após método do aluno %s = %.0f\n ", aluno1.getNome(), aluno1.getPontos());

		leia.close();

	}

}

