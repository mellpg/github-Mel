package Base5;

public class Valor {

	private final double preco;

	public Valor(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public Valor somar(double valorExtra) {
		if (valorExtra <= 0) {

			throw new IllegalArgumentException("Valor extra inválido");

		}
		return new Valor(this.preco + valorExtra);
	}

}
