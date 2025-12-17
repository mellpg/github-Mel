package Api_Streams_Generics;

import java.math.BigDecimal;
import java.util.Optional;

public class EntidadePedido {

	private String nome;
	private BigDecimal valor;
	private Optional<String> observacao;

	public void Pedido(String nome, BigDecimal valor) {
		this.nome = nome;
		this.valor = valor;
		this.observacao = Optional.empty();
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
