package Base2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1️⃣ Ler nome do produto
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = scanner.nextLine();

		// 2️⃣ Ler preço inicial
		System.out.print("Digite o preço do produto: ");
		double valorPreco = scanner.nextDouble();

		// 3️⃣ Criar objetos de domínio
		Preco preco = new Preco(valorPreco);
		Produto produto = new Produto(nomeProduto, preco);

		// 4️⃣ Criar service
		ProdutoService service = new ProdutoService();

		// 5️⃣ Ler percentual de desconto
		System.out.print("Digite o percentual de desconto (1 a 50): ");
		double percentual = scanner.nextDouble();

		// 6️⃣ Aplicar desconto
		service.aplicarDesconto(produto, percentual);

		// 7️⃣ Verificar se é caro
		boolean caro = service.isCaro(produto);

		// 8️⃣ Exibir resultado
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço final: " + produto.getPreco().getValor());
		System.out.println("É caro? " + caro);

		scanner.close();
	}
}
