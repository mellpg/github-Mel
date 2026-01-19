package PetModel;

import java.util.Scanner;

public class Main {

	/*
	 * throws Exception é uma palavra-chave que é usada na declaração de um método
	 * para indicar que ele pode lançar uma exceção, ou seja, sua responsabilidade
	 * de tratar é de quem a chama, para alertar o compilador e outros programadores
	 * Ele não trata as exceções internamente comum em programas de estudo para não
	 * poluir o código com try/catch logo no início
	 */

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Service service = new Service();

		while (true) {
			System.out.print("Nome do pet (ou exit): ");
			String nome = sc.nextLine();
			if (nome.equalsIgnoreCase("exit"))
				break;

			System.out.print("Tipo: ");
			String tipo = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();

			System.out.print("Sexo: ");
			String sexo = sc.nextLine();

			// Declaração da variável
			Condicao condicao;
			// Validação em loop, so irá acabar se for inserida uma condiçãp válida
			while (true) {
				try {
					System.out.print("Condição (BOA/RUIM/EMERGENCIA): ");
					// toUpperCase() -> Conversão em maiúsculo
					// valueOf() -> tenta converter o texto em um valor do enum
					// Por exemplo: "boa" -> "BOA"
					condicao = Condicao.valueOf(sc.nextLine().toUpperCase());
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Opção inválida!");
				}
			}
			// Amarzenando Pet
			service.adicionar(nome, new Pet(tipo, idade, sexo, condicao));
		}

		// Criando o Excel
		new ExcelExporter().exportar(service.listar());
		System.out.println("Excel gerado com sucesso!");

		sc.close();
	}

}
