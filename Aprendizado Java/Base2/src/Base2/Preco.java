package Base2;

// Classe Value Object
// Imutável
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

	// AQUI acontece o cálculo
	// Retorna um NOVO Preco (imutabilidade)
	public Preco aplicarDesconto(double percentual) {

		if (percentual <= 0 || percentual > 50) {
			throw new IllegalArgumentException("Percentual inválido");
		}

		double novoValor = valor * (1 - percentual / 100);

		return new Preco(novoValor);
	}
}
