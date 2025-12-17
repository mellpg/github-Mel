package Base2;

public class Produto {

	private String nome;

	private Preco preco;

	public Produto(String nome, Preco preco) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome inválido.");
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

	// Validando se o novo preço é válido
	public void alterarPreco(Preco novoPreco) {
		if (novoPreco == null) {
			throw new IllegalArgumentException("Novo preço inválido.");
		}
		this.preco = novoPreco;
	}

}
