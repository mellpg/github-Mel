package Base4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1️⃣ Ler valor inicial do pedido
		System.out.print("Digite o valor inicial do pedido: ");
		double valorInicial = scanner.nextDouble();

		ValorMonetario totalInicial = new ValorMonetario(valorInicial);
		Pedido pedido = new Pedido(totalInicial);

		// 2️⃣ Criar service
		PedidoService service = new PedidoService();

		// 3️⃣ Ler valor a adicionar
		System.out.print("Digite o valor a adicionar ao pedido: ");
		double valorAdicionar = scanner.nextDouble();

		service.adicionarValor(pedido, valorAdicionar);

		// 4️⃣ Ler percentual de desconto
		System.out.print("Digite o percentual de desconto: ");
		double percentual = scanner.nextDouble();

		service.aplicarDesconto(pedido, percentual);

		// 5️⃣ Mostrar resultado final
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Total final do pedido: " + pedido.getTotal().getValor());

		scanner.close();
	}
}
