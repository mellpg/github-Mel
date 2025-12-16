package Base3;

public class Preco {

	private final double valor;

	public Preco(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public Preco aplicarDesconto(Percentual percentual) {
		double novoValor = valor * percentual.fator();
		return new Preco(novoValor);
	}
}
