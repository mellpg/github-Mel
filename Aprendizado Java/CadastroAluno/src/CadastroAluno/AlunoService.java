package CadastroAluno;

public class AlunoService {

	// Método para verificar se o Aluno está aprovado
	public boolean isAprovado(Aluno aluno) {
		// validação do objeto
		if (aluno == null) {
			throw new IllegalArgumentException("Aluno inválido");
		}
		// Regra de negócio
		return aluno.getMedia() >= 7.5;

	}

	// Regra de nota máxima
	public boolean notaMaxima(Aluno aluno) {
		return aluno.getMedia() == 10;

	}

}
// Sintaxe e fluxo:

// public boolean → método público que retorna verdadeiro/falso

// Service não altera estado da entidade diretamente, apenas avalia regras

// Separa responsabilidade: entidade guarda estado, service aplica regras