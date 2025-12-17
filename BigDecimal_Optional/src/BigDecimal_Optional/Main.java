package BigDecimal_Optional;

import java.math.BigDecimal;
import java.util.Scanner;

// Conceito

// BIG DECIMAL - ENUM - OPTIONAL

// Big decimal ->

// Quando valores não podem ter erros de arredondamento
// Usado em bancos, e-commerce, sistemas financeiros
// Contexto real: Valores não podem ter erro de arredondamento

// Enum ->

// Define valores fixos, evita erro de digitação e deixa o código mais legível e seguro
// Contexto real: Status do pagamento não pode ser qualquer texto solto

// Optional ->

// Representa um valor que pode existir ou não, evita null e força o programador a tratar o caso vazio
// Contexto real: Alguns dados podem existir ou não, sem dar NullPointerException

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Valor inicial
		System.out.print("Digite o valor do pagamento: ");
		BigDecimal valor = new BigDecimal(scanner.nextLine());

		Pagamento pagamento = new Pagamento(valor);

		// Desconto
		System.out.print("Deseja aplicar desconto? (s/n): ");
		String respDesconto = scanner.nextLine();

		if (respDesconto.equalsIgnoreCase("s")) {
			System.out.print("Digite o valor do desconto: ");
			BigDecimal desconto = new BigDecimal(scanner.nextLine());
			pagamento.aplicarDesconto(desconto);
		}

		// Multa
		System.out.print("Deseja aplicar multa? (s/n): ");
		String respMulta = scanner.nextLine();

		if (respMulta.equalsIgnoreCase("s")) {
			System.out.print("Digite o valor da multa: ");
			BigDecimal multa = new BigDecimal(scanner.nextLine());
			pagamento.aumentarValor(multa);
		}

		// Pagamento
		pagamento.pagar("COMPROVANTE_GERADO");

		// Resultado final
		System.out.println("\n--- RESUMO ---");
		System.out.println("Valor final: R$ " + pagamento.getValor());
		System.out.println("Status: " + pagamento.getStatus());

		// Optional em uso
		pagamento.getComprovante().ifPresent(c -> System.out.println("Comprovante: " + c));

		scanner.close();
	}
}