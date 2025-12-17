package BigDecimal_Optional2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1) Valor da fatura
		System.out.print("Digite o valor da fatura: ");
		BigDecimal valor = new BigDecimal(scanner.nextLine());

		// 2) Tipo de pagamento
		System.out.println("Escolha o tipo de pagamento:");
		System.out.println("1 - PIX");
		System.out.println("2 - CARTAO");
		System.out.println("3 - BOLETO");

		int opcao = scanner.nextInt();
		scanner.nextLine();
		// Declarando variável TipoPagamento
		TipoPagamento tipoPagamento;

		switch (opcao) {
		case 1:
			tipoPagamento = TipoPagamento.PIX;
			break;
		case 2:
			tipoPagamento = TipoPagamento.CARTAO;
			break;
		case 3:
			tipoPagamento = TipoPagamento.BOLETO;
			break;
		default:
			System.out.println("Opção inválida. PIX será usado.");
			tipoPagamento = TipoPagamento.PIX;
		}

		// 3) Criação da Fatura

		Fatura fatura = new Fatura(valor, tipoPagamento);

		// 4) Desconto percentual

		System.out.print("Deseja aplicar desconto percentual? (s/n): ");
		String respDesconto = scanner.nextLine();

		if (respDesconto.equalsIgnoreCase("s")) {
			System.out.print("Digite o percentual de desconto: ");
			BigDecimal percentual = new BigDecimal(scanner.nextLine());
			fatura.aplicarDescontoPercentual(percentual);
		}

		// 5) Aplicar taxa do tipo de pagamento

		fatura.aplicarTaxaPagamento();

		// 6) Descrição opcional
		System.out.print("Deseja adicionar uma descrição? (s/n): ");
		String respDesc = scanner.nextLine();

		if (respDesc.equalsIgnoreCase("s")) {
			System.out.print("Digite a descrição: ");
			String texto = scanner.nextLine();
			fatura.definirDescricao(texto);
		}

		// 7) Resultado

		System.out.println("\n===== RESUMO DA FATURA =====");
		System.out.println("Valor final: R$ " + fatura.getValor());
		System.out.println("Tipo de pagamento: " + tipoPagamento);

		// Optional ( Só vai mostrar se existir)
		fatura.getDescricao().ifPresent(d -> System.out.println("Descrição: " + d));

		// Fecha o Scanner (boa prática)
		scanner.close();

	}

}
