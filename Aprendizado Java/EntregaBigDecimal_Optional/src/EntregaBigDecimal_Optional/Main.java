package EntregaBigDecimal_Optional;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		System.out.print("Digite o nome do pedido: ");
		String name = scanner.nextLine();

		System.out.print("Digite o valor do pedido: ");

		BigDecimal valor = new BigDecimal(scanner.nextLine());

		System.out.println("Escolha a Forma de entrega:");
		System.out.println("1 - RETIRADA");
		System.out.println("2 - PAC");
		System.out.println("3 - SEDEX");

		int opcao = scanner.nextInt();
		scanner.nextLine();

		FormaEntrega formaEntrega = null;

		switch (opcao) {
		case 1:
			formaEntrega = FormaEntrega.RETIRADA;
			break;
		case 2:
			formaEntrega = FormaEntrega.PAC;
		case 3:
			formaEntrega = FormaEntrega.SEDEX;
		default:
			System.out.println("Nenhuma opção selecionada:");

		}

		Pedido pedido = new Pedido(valor, formaEntrega);

		System.out.print("Deseja aplicar desconto percentual? (s/n): ");
		String respDesconto = scanner.nextLine();

		if (respDesconto.equalsIgnoreCase("s")) {
			System.out.print("Digite o percentual de desconto: ");
			BigDecimal percentual = new BigDecimal(scanner.nextLine());
			pedido.aplicarDesconto(percentual);
		}

		// Aplicando Taxa da forma de entrega

		pedido.aplicarTaxaEntrega();

		System.out.print("Deseja adicionar uma descrição? (s/n): ");
		String respDesc = scanner.nextLine();

		if (respDesc.equalsIgnoreCase("s")) {
			System.out.print("Digite a descrição: ");
			String texto = scanner.nextLine();
			pedido.definirDescricao(texto);
		}

		System.out.println("\n===== RESUMO DO PEDIDO =====");
		System.out.println("Nome do pedido: " + name);
		System.out.println("Valor final: R$ " + pedido.getValor());
		System.out.println("Forma de entrega: " + formaEntrega);

		pedido.getObservacao().ifPresent(d -> System.out.println("Descrição: " + d));

		// Fecha o Scanner (boa prática)
		scanner.close();

	}

}
