package Base3;

public class Percentual {

	private final double valor;

	public Percentual(double valor) {
		if (valor <= 0 || valor > 50) {
			throw new IllegalArgumentException("Percentual inválido");
		}
		this.valor = valor;
	}

	public double fator() {
		return 1 - (valor / 100);
	}

}
