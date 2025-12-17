package Base4;

// Regras de negócio do Pedido
public class PedidoService {

	// Adiciona valor ao pedido
	public void adicionarValor(Pedido pedido, double valor) {

		ValorMonetario novoTotal = pedido.getTotal().somar(valor);

		pedido.alterarTotal(novoTotal);
	}

	// Aplica desconto ao pedido
	public void aplicarDesconto(Pedido pedido, double percentual) {

		ValorMonetario novoTotal = pedido.getTotal().aplicarDesconto(percentual);

		pedido.alterarTotal(novoTotal);
	}
}
