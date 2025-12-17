package Base3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome do produto: ");
		String nome = scanner.nextLine();

		System.out.print("Preço: ");
		Preco preco = new Preco(scanner.nextDouble());

		System.out.print("Percentual de desconto: ");
		Percentual percentual = new Percentual(scanner.nextDouble());

		Produto produto = new Produto(nome, preco);
		ProdutoService service = new ProdutoService();

		service.aplicarDesconto(produto, percentual);

		System.out.println("Preço final: " + produto.getPreco().getValor());

		scanner.close();
	}
}
