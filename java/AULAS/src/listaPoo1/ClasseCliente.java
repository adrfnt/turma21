package listaPoo1;

public class ClasseCliente {
	
	//atributos
	public String nome;
	public int doc;
	public int anoNasc;
	
	//m�todo
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNasc;
		
	}

}