package Base4;

// Quem calcula (Value Object)
// Imutável
public class ValorMonetario {

	private final double valor;

	public ValorMonetario(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	// Soma um valor ao total atual
	public ValorMonetario somar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido para soma");
		}
		return new ValorMonetario(this.valor + valor);
	}

	// Aplica desconto percentual
	public ValorMonetario aplicarDesconto(double percentual) {
		if (percentual <= 0 || percentual > 50) {
			throw new IllegalArgumentException("Percentual inválido");
		}
		double novoValor = valor * (1 - percentual / 100);
		return new ValorMonetario(novoValor);
	}
}
