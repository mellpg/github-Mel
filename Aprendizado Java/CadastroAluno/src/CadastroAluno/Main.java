package CadastroAluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // cria scanner

		while (true) {

			// Entrando com os dados
			System.out.println("Digite o nome do Aluno:");
			// Criando VO Nome
			Nome nome = new Nome(scanner.nextLine());

			System.out.print("Digite o email do aluno: ");
			Email email = new Email(scanner.nextLine());

			System.out.print("Digite a média do aluno: ");
			double media = scanner.nextDouble();
			scanner.nextLine(); // limpa o buffer

			// Criando a entidade
			Aluno aluno = new Aluno(nome, email, media);

			// Criando AlunoService
			AlunoService service = new AlunoService();

			// Verifica aprovação
			boolean aprovado = service.isAprovado(aluno);

			// Retornos
			System.out.println("\n--- DADOS DO ALUNO ---");
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("Média: " + aluno.getMedia());
			System.out.println("Situação: " + (aprovado ? "APROVADO" : "REPROVADO"));

			break; // sai do while
		}

		scanner.close(); // fecha scanner
	}
}
