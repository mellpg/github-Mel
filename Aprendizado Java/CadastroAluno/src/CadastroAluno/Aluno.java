package CadastroAluno;

// Entidade Aluno
public class Aluno {

	private Nome nome; // VO
	private Email email; // VO
	private double media; // Valor simples

	// Construtor Aluno
	public Aluno(Nome nome, Email email, double media) {
		if (media < 0 || media > 10) {
			throw new IllegalArgumentException("Média inválida");
		}
		this.nome = nome;
		this.email = email;
		this.media = media;
	}
	// Getters -> Para o acesso controlado dos atributos

	public String getNome() {
		return nome.getValor();
	}

	public String getEmail() {
		return email.getValor();
	}

	public double getMedia() {
		return media;
	}

	// Setter controlado -> Permitir alteração de Email
	public void alterarEmail(Email novoEmail) {
		this.email = novoEmail;
	}

}
