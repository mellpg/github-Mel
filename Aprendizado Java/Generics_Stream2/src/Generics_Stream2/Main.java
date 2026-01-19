package Generics_Stream2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

//  Exemplo de um sistema de Usuários e Login

public class Main {

	public static void main(String[] args) {
		// Entrada de dados
		Scanner scanner = new Scanner(System.in, "UTF-8");
		// Criando repositorio usando nosso Generic
		Repositorio<Usuario> repositorio = new Repositorio<>();

		System.out.print("Quantos usuários deseja cadastrar? ");
		int qtd = scanner.nextInt();
		scanner.nextLine();

		// Realizando cadastro

		for (int i = 0; i < qtd; i++) {
			System.out.print("Nome: ");
			String nome = scanner.nextLine();

			System.out.print("Email: ");
			String email = scanner.nextLine();

			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nível de acesso:");
			System.out.println("1 - ADMIN");
			System.out.println("2 - USUARIO");
			System.out.println("3 - VISITANTE");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			// Escolhendo seu nível de acesso:
			NivelAcesso nivel = switch (opcao) {
			case 1 -> NivelAcesso.ADMIN;
			case 2 -> NivelAcesso.USUARIO;
			default -> NivelAcesso.VISITANTE;
			};

			// Criando o usuário com base na escolha:
			Usuario usuario = new Usuario(nome, email, idade, nivel);

			// Optional
			System.out.print("Deseja informar telefone? (s/n): ");
			if (scanner.nextLine().equalsIgnoreCase("s")) {
				System.out.print("Telefone: ");
				usuario.definirTelefone(scanner.nextLine());
			}

			repositorio.adicionar(usuario);
		}
		// Retornando dados
		List<Usuario> usuarios = repositorio.listar();

		// Streams

		// 1) Filtrar
		System.out.println("\nUsuários maiores de 18:");
		usuarios.stream().filter(u -> u.getIdade() >= 18).forEach(System.out::println);

		// 2) Buscar (Optional)
		System.out.println("\nBuscar ADMIN:");
		Optional<Usuario> admin = usuarios.stream().filter(u -> u.getNivel() == NivelAcesso.ADMIN).findFirst();

		admin.ifPresentOrElse(u -> System.out.println("Admin encontrado: " + u),
				() -> System.out.println("Nenhum admin encontrado"));

		// 3) Ordenação
		System.out.println("\nOrdenados por idade:");
		usuarios.stream().sorted(Comparator.comparing(Usuario::getIdade)).forEach(System.out::println);

		// 4) Map -> Transformação
		System.out.println("\nEmails dos usuários:");
		usuarios.stream().map(Usuario::getEmail).forEach(System.out::println);

		// 5) Média
		double mediaIdade = usuarios.stream().mapToInt(Usuario::getIdade).average().orElse(0);

		System.out.println("\nMédia de idade: " + mediaIdade);

		// 6) Validação

		boolean existeMenor = usuarios.stream().anyMatch(u -> u.getIdade() < 18);

		System.out.println("\nExiste menor de idade? " + existeMenor);

		scanner.close();

	}

}
