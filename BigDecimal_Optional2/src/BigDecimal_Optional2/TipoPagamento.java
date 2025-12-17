package BigDecimal_Optional2;

public enum TipoPagamento {

	PIX(0), // sem taxa
	CARTAO(2), // 2% de taxa
	BOLETO(1); // 1% de taxa

	// Atributos
	private int taxaPercentual;

	// Construtor do enum (sempre ser privado)
	TipoPagamento(int taxaPercentual) {
		this.taxaPercentual = taxaPercentual;
	}

	// Método do enum
	// Para acessar dado dentro do Enum para aplicar na regra de negócio
	public int getTaxaPercentual() {
		return taxaPercentual;
	}

}
