package CadastroAluno;

public class Email {
	// VO
	private final String valor; // imutável

	public Email(String valor) {
		if (valor == null || valor.isBlank()) {
			throw new IllegalArgumentException("Email não pode ser vazio");
		}
		// valida se contém "@"
		if (!valor.contains("@")) {
			throw new IllegalArgumentException("Email inválido");
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

// Sintaxe importante:

// !valor.contains("@") → operador ! nega a condição, contains() verifica substring

// VO separado → mantém validação centralizada

// Sempre que você precisar de email válido, cria um Email
