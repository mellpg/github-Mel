package Base;

public class Usuario {

	// Aplicando encapsulamento
	private String email;
	private String senha;
	private Nome nome;

	// Aplicando o construtor
	// validando dados essenciais
	public Usuario(Nome nome, String email, String senha) {

		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Email inválido.");
		}
		if (senha == null || senha.length() < 6) {
			throw new IllegalArgumentException("Senha muito curta.");
		}

		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	// Aplicando getters e setters
	// get - pega valores
	// set - muda valores
	// set é melhor evitar quando a classe deve ser estável

	public Nome getNome() {
		return nome;
	}

	// Setter controlado (permite mudar o nome, mas NÃO permite valores inválidos)
	public void setNome(Nome nome) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome inválido.");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email; // evitar setter de email
	}

	public String getSenha() {
		return senha;
	}

	// Setter de senha, mas com verificação de segurança
	public void setSenha(String senha) {
		if (senha == null || senha.length() < 6) {
			throw new IllegalArgumentException("Nova senha inválida.");
		}
		this.senha = senha;
	}
}
