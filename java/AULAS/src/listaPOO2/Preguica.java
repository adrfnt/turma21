package listaPOO2;

public class Preguica extends Animal {

	// construtor
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override //m�todo baseado na classe m�e
	public void som () {
		System.out.println("Sil�ncio...");
	}
	
	public void subirArvore() {
		System.out.println("Subindo em Arvore...");
	}
}
