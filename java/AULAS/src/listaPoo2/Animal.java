package listaPoo2;

import Interfaces.InterfaceAnimal;

public abstract class Animal implements InterfaceAnimal {

	// atributos
	private String nome;
	private int idade;

	// construtor
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	// encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	//métodos
		
	@Override
	public void movimento() {
		System.out.println("Correndo...");
	}
	
}
