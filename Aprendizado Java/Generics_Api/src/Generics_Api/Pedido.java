package Generics_Api;

import java.math.BigDecimal;

// Entidade: Pedido
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

	public void definirObservacao(String texto) {
		this.observacao = Optional.ofNullable(texto);
	}

	@Override
	public String toString() {
		return nome + " - R$ " + valor;
	}

}
