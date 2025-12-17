package Base4;

// Quem tem o valor (Entidade)
public class Pedido {

	private ValorMonetario total;

	public Pedido(ValorMonetario total) {
		if (total == null) {
			throw new IllegalArgumentException("Total inválido");
		}
		this.total = total;
	}

	public ValorMonetario getTotal() {
		return total;
	}

	// Entidade pode trocar seu estado
	public void alterarTotal(ValorMonetario novoTotal) {
		if (novoTotal == null) {
			throw new IllegalArgumentException("Novo total inválido");
		}
		this.total = novoTotal;
	}
}
