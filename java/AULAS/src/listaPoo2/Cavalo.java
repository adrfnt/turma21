package listaPoo2;

public class Cavalo extends Animal {
	
	// construtor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override //m�todo baseado na classe m�e
	public void emitirSom() {
		System.out.println("Irrriii...");
	}

}

