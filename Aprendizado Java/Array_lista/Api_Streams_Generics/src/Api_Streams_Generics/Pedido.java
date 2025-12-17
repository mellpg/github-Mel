package Api_Streams_Generics;

// Aplicações vida real: pedido, produto, fatura, compra

import java.math.BigDecimal;
import java.util.Optional;

public class Pedido {

	private String nome;
	private BigDecimal valor;
	private Optional<String> observacao;

	public Pedido(String nome, BigDecimal valor) {
		this.nome = nome;
		this.valor = valor;
		this.observacao = Optional.empty(); // começa vazio
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Optional<String> getObservacao() {
		return observacao;
	}

	@Override
	public String toString() {
		return nome + " - R$ " + valor;
	}

}
