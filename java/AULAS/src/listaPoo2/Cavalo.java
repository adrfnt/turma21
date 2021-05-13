package listaPoo2;

public class Cavalo extends Animal {
	
	// construtor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override //método baseado na classe mãe
	public void emitirSom() {
		System.out.println("Irrriii...");
	}

}

