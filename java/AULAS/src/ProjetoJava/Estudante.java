package ProjetoJava;

public class Estudante {

		
		//atributos 
		
		private String nome;
		private int matricula; //no minimo ter matricula e cpf (construtor)
		private  String cpf;
		private double pontos;  ///Não podem ser alterados manualmente, somente método, segurança total de dados (private/ encapsulamento)
		private boolean status;
		
			
		//construtores
		public Estudante(int matricula, String cpf) {
			super();
			this.matricula = matricula;
			this.cpf = cpf;
		}
					
		//encapsulamento - getter and setters (alt+shift+S)
		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public double getPontos() {
			return pontos;
		}

		/*public void setPontos(double pontos) {
			this.pontos = pontos;
		}*/

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
			
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		//métodos
		public void adicionarNota(double pontos) {
			this.pontos = this.pontos+pontos; //this.pontos+=pontos;
		}
		
		public void tirarNotas(double pontos) {
			this.pontos = this.pontos-pontos;
		}
	}
