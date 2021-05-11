package listaPOO2;

public class testeAnimal {
	
	public static void main(String[] args) {
	
	Cachorro cachorro = new Cachorro("Billy", 7);   //nome,idade
	Cavalo cavalo = new Cavalo("Sprint", 6);
	Preguica preguica = new Preguica("Koya", 12);

	System.out.println("Nome: %s\n"+cachorro.getNome());
	System.out.println("Idade: %d\n"+cachorro.getIdade());
	cachorro.som();
	cachorro.correr();
	

	System.out.println("Nome: %s\n"+cavalo.getNome());
	System.out.println("Idade: %d\n"+cavalo.getIdade());
	cavalo.som();
	cavalo.correr();
	System.out.println();

	System.out.println("Nome: %s\n"+preguica.getNome());
	System.out.println("Idade: %d\n"+preguica.getIdade());
	preguica.som();
	preguica.subirArvore();
	
	}

}
