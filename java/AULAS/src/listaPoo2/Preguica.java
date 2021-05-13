package listaPoo2;

public class Preguica extends Animal {

	// construtor
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override //m�todo baseado na classe m�e
	public void emitirSom () {
		System.out.println("ZzzZZZzz...");
	}
	
	@Override
	public void movimento() {
		System.out.println("Subindo em arvore");
	}
}
