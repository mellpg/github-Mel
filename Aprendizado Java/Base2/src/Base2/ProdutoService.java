package Base2;

// Regras de negócio do Produto
public class ProdutoService {

	// Aplica desconto seguindo regras de negócio
	public void aplicarDesconto(Produto produto, double percentual) {

		if (percentual <= 0 || percentual > 50) {
			throw new IllegalArgumentException("Percentual inválido");
		}

		Preco novoPreco = produto.getPreco().aplicarDesconto(percentual);

		produto.alterarPreco(novoPreco);
	}

	// Verifica se o produto é caro
	public boolean isCaro(Produto produto) {
		return produto.getPreco().getValor() > 100;
	}
}
