package Base;

public class Nome {

	private final String valor;

	public Nome(String valor) {
		if (valor == null || valor.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}

		if (valor.length() < 2) {
			throw new IllegalArgumentException("Nome muito curto");
		}

		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return valor;
	}
}

// Nome é imutável (não tem setter)
// Validação fica dentro do próprio objeto
// toString() ajuda a exibir o nome diretamente.
