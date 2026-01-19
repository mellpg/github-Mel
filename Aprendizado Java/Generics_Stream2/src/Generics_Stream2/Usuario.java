package Generics_Stream2;

import java.util.Optional;

// Entidade
// Classe de domínio (modelo real do sistema)

public class Usuario {

	private String nome;
	private String email;
	private int idade;
	private NivelAcesso nivel;
	private Optional<String> telefone;

	public Usuario(String nome, String email, int idade, NivelAcesso nivel) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.nivel = nivel;
		this.telefone = Optional.empty();
	}

	// Seus getters

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public NivelAcesso getNivel() {
		return nivel;
	}

	public Optional<String> getTelefone() {
		return telefone;
	}

	// Optional
	public void definirTelefone(String telefone) {
		this.telefone = Optional.ofNullable(telefone);
	}

	// Optional evita null e força tratamento correto

	@Override
	public String toString() {
		return nome + " | " + email + " | " + idade + " anos | " + nivel;
	}

}
