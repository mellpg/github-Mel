package BigDecimal_Optional2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

public class Fatura {

	// Valor base da fatura

	private BigDecimal valor;

	// Tipo de pagamento a escolher

	private TipoPagamento tipoPagamento2;

	// Descrição opcional

	private Optional<String> descricao;

	// Construtor

	public Fatura(BigDecimal valor, TipoPagamento tipoPagamento2) {
		this.valor = valor;
		this.tipoPagamento2 = tipoPagamento2;
		this.descricao = Optional.empty();
	}

	// Getter
	public BigDecimal getValor() {
		return valor;
	}

	// Aplica desconto percentual
	public void aplicarDescontoPercentual(BigDecimal percentual) {
		BigDecimal desconto = valor.multiply(percentual).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

		valor = valor.subtract(desconto);
	}

	// Aplica taxa baseada no enum
	public void aplicarTaxaPagamento() {
		BigDecimal taxa = valor.multiply(new BigDecimal(tipoPagamento2.getTaxaPercentual()))
				.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

		valor = valor.add(taxa);
	}

	// Compara valores
	public boolean valorMaiorQue(BigDecimal outro) {
		return valor.compareTo(outro) > 0;
	}

	// Define descrição opcional
	public void definirDescricao(String texto) {
		this.descricao = Optional.ofNullable(texto);
	}

	// Getter Optional
	public Optional<String> getDescricao() {
		return descricao;
	}
}

// Vida real: fatura bancária, mensalidade, boleto, imposto.