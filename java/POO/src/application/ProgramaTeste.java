package application;

import java.util.Scanner;
import Entities.estudante;

public class ProgramaTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		estudante alunoEd = new estudante(10,"158.154.214-26"); //instanciamento do objeto, usando construtor nome, cpf
		estudante alunoAline = new estudante(10,"158.154.214-27",true); //usando contrutor nome,cpf e pontos
		//estudante alunoArthur = new estudante(10,"158.154.214-26",8.5,true);
		
		alunoEd.setCpf("158.154.214-28"); //para mudar informação do cpf*/
	
		
		System.out.println(alunoEd.getCpf());
		System.out.println(alunoAline.getCpf());
		System.out.println("Digite o nome do aluno do Ed: ");
		String nome = leia.next();
		System.out.println("Digite a nota do aluno do Ed: ");
		double nota = leia.nextDouble();
		
		alunoEd.setNome(nome);
		alunoEd.adicionarNota(nota);
		System.out.println("Matricula: "+alunoEd.getMatricula()+"\nNome: "+alunoEd.getNome()+"\nNota: "+alunoEd.getPontos());
		
		leia.close();
	}

}
