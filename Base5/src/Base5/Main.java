package Base5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1️⃣ Ler descrição do pedido
		System.out.print("Digite a descrição do pedido: ");
		String descricao = scanner.nextLine();

		// 2️⃣ Ler valor inicial
		System.out.print("Digite o valor do pedido: ");
		double valorInicial = scanner.nextDouble();

		// 3️⃣ Criar Value Object
		Valor valor = new Valor(valorInicial);

		// 4️⃣ Criar Pedido
		Pedido pedido = new Pedido(descricao, valor);

		// 5️⃣ Ler valor extra
		System.out.print("Digite um valor extra para somar: ");
		double valorExtra = scanner.nextDouble();

		// 6️⃣ Criar novo Valor (imutável)
		Valor novoValor = pedido.getValor().somar(valorExtra);

		// 7️⃣ Atualizar Pedido
		pedido.alterarValor(novoValor);

		// 8️⃣ Mostrar resultado
		System.out.println("\n--- RESULTADO ---");
		System.out.println("Pedido: " + pedido.getDescricao());
		System.out.println("Valor final: " + pedido.getValor().getPreco());

		scanner.close();
	}
}
