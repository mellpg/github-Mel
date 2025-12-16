package Base3;

public class Produto {

	private String nome;
	private Preco preco;

	public Produto(String nome, Preco preco) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Preco getPreco() {
		return preco;
	}

	public void alterarPreco(Preco novoPreco) {
		this.preco = novoPreco;
	}

}
