package EntregaBigDecimal_Optional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

public class Pedido {

	private BigDecimal valor;

	private FormaEntrega formaEntrega;

	private Optional<String> observacao;

	public Pedido(BigDecimal valor, FormaEntrega formaEntrega) {
		this.valor = valor;
		this.formaEntrega = formaEntrega;
		this.observacao = Optional.empty();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void aplicarDesconto(BigDecimal percentual) {
		BigDecimal desconto = valor.multiply(percentual).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

		valor = valor.subtract(desconto);
	}

	public void aplicarTaxaEntrega() {
		BigDecimal taxa = valor.multiply(new BigDecimal(formaEntrega.getOption())).divide(new BigDecimal("100"), 2,
				RoundingMode.HALF_UP);

		valor = valor.add(taxa);
	}

	public void definirDescricao(String texto) {
		this.observacao = Optional.ofNullable(texto);
	}

	public Optional<String> getObservacao() {
		return observacao;
	}

}
