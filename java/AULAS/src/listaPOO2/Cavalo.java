package listaPOO2;

public class Cavalo extends Animal {
	
	// construtor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override //método baseado na classe mãe
	public void som () {
		System.out.println("Irrriii...");
	}

	public void correr() {
		System.out.println("CORRENDO...");
	}
}

