package Base5;

public class Pedido {

	private String descricao;
	private Valor valor;

	public Pedido(String descricao, Valor valor) {
		if (descricao == null || descricao.isBlank()) {
			throw new IllegalArgumentException("Descrição inválida");
		}
		if (valor == null) {
			throw new IllegalArgumentException("Valor inválido");
		}
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public Valor getValor() {
		return valor;
	}

	public void alterarValor(Valor novoValor) {
		if (novoValor == null) {
			throw new IllegalArgumentException("Novo valor inválido");
		}
		this.valor = novoValor;
	}
}
