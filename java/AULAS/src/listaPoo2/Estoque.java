package listaPoo2;

public class Estoque {
	
	private String tipo;
	private int qtde;
	private double valor;
	
	//construtor
	public Estoque(String tipo, int qtde, double valor) {
		super();
		this.tipo = tipo;
		this.qtde = qtde;
		this.valor = valor;
	}
	
	//encapsulamento
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//método
	
	

}