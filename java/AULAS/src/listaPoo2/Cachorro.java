package listaPoo2;

public class Cachorro extends Animal {

	// construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override //método baseado na classe mãe
	public void emitirSom() {
		System.out.println("Au au au...");
	}
	
	
}


