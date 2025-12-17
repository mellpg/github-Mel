package User;

// Objeto nasce válido
// Atributos estão protegidos (private)
// A classe representa APENAS o modelo/entidade
public class Usuario {

	private String senha;

	private final String email;

	private final String nome;

	public Usuario(String senha, String email, String nome) {

		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		if (!email.contains("@")) {
			throw new IllegalArgumentException("Email inválido");
		}
		if (senha.length() < 6) {
			throw new IllegalArgumentException("Senha muito curta");
		}

		this.senha = senha;
		this.email = email;
		this.nome = nome;
	}

	public String getEmail() {

		return this.email;
	}

	public boolean senhaCorreta(String senhaDigitada) {
		return this.senha.equals(senhaDigitada);
	}
}
