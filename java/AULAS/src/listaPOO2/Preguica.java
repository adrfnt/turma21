package listaPOO2;

public class Preguica extends Animal {

	// construtor
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override //método baseado na classe mãe
	public void som () {
		System.out.println("Silêncio...");
	}
	
	public void subirArvore() {
		System.out.println("Subindo em Arvore...");
	}
}
