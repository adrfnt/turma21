package listaPoo2;

public class testeAnimal {
	
	public static void main(String[] args) {
	
	Animal cachorro = new Cachorro("Billy", 7);   //nome,idade
	Animal cavalo = new Cavalo("Sprint", 6);
	Animal preguica = new Preguica("Koya", 12);

	System.out.println("Nome: "+cachorro.getNome());
	System.out.println("Idade: "+cachorro.getIdade());
	cachorro.emitirSom();
	cachorro.movimento();

	System.out.println("Nome: "+cavalo.getNome());
	System.out.println("Idade: "+cavalo.getIdade());
	cavalo.emitirSom();
	cavalo.movimento();
	
	System.out.println("Nome: "+preguica.getNome());
	System.out.println("Idade: "+preguica.getIdade());
	preguica.emitirSom();
	preguica.movimento();
	
	
	}

}
