package EntregaBigDecimal_Optional;

public enum FormaEntrega {

	RETIRADA(0), // sem taxa
	PAC(5), // 2% de taxa
	SEDEX(10); // 1% de taxa

	private int option;

	FormaEntrega(int option) {
		this.option = option;

	}

	public int getOption() {
		return option;
	}

}
