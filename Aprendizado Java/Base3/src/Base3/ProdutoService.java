package Base3;

public class ProdutoService {

	public void aplicarDesconto(Produto produto, Percentual percentual) {
		Preco novoPreco = produto.getPreco().aplicarDesconto(percentual);

		produto.alterarPreco(novoPreco);
	}

	public boolean isCaro(Produto produto) {
		return produto.getPreco().getValor() > 100;
	}
}
