package listaPoo2;

public class Cachorro extends Animal {

	// construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override //m�todo baseado na classe m�e
	public void emitirSom() {
		System.out.println("Au au au...");
	}
	
	
}


