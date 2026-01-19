package ProjetoPetModel;

// Entidade: Pet

public class Pet {

	private String tipo;
	private int idade;
	private String sexo;
	private Condicao condicao;

	public Pet(String tipo, int idade, String sexo, Condicao condicao) {
		this.tipo = tipo;
		this.idade = idade;
		this.sexo = sexo;
		this.condicao = condicao;
	}

	public String getTipo() {
		return tipo;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public Condicao getCondicao() {
		return condicao;
	}

}
