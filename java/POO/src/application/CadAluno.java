package application;

import java.util.Scanner;

import Entities.Aluno;

public class CadAluno {

	public static void main(String[] args) {
		//teste programador
		Scanner leia = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno(1,"046.786.749-65","Ana"); 
		Aluno aluno2 = new Aluno(2,"045.789.589-25","Maria");
		Aluno aluno3 = new Aluno(3,"João");
		
		aluno1.nome = "Maria";
		
		aluno1.nome = "Ana";
		aluno1.anoNascimento = 1990;
		
		System.out.println(aluno2.cpf);
		
		aluno3.mostrarIdade(2030);
		
		leia.close();
	}

}
