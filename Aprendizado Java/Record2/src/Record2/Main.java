package Record2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Entrando com os dados
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Cadastro de Pedido ===");

		System.out.print("Nome do cliente: ");
		String nome = scanner.nextLine();

		System.out.print("Produto: ");
		String produto = scanner.nextLine();

		System.out.print("Valor do produto: ");
		double valor = scanner.nextDouble();

		/*
		 * Criando um Record É como se fosse um construtor de classes convencionais
		 * Criando o Pedido:
		 */
		SistemaPedido.Pedido pedido = new SistemaPedido.Pedido(nome, produto, valor);

		System.out.println("\n=== Dados do Pedido ===");

		/*
		 * Getters não usam getNome() O nome do atributo já é o método Explicação: Em
		 * uma classe comum: public class Pessoa { private String nome;
		 * 
		 * public String getNome() { return nome; } } E para acessar: Pessoa p = new
		 * Pessoa("Ana"); System.out.println(p.getNome());
		 * 
		 * Funcionamento quando se trata de Record: Você declara assim: public record
		 * Pedido(String nomeCliente, String produto, double valor) {} O próprio Java
		 * cria os getters, sem o get Cria os métodos com o mesmo nome do Atributo Para
		 * acessar por exemplo você NÃO usa: getNomeCliente() E sim: nomeCliente()
		 */

		// Acessando Record
		System.out.println("Cliente: " + pedido.nomeCliente());
		System.out.println("Produto: " + pedido.produto());
		System.out.println("Valor original: R$ " + pedido.valor());

		// Métodos do record
		System.out.println("Taxa de serviço: R$ " + pedido.calcularTaxaServico());
		System.out.println("Valor final: R$ " + pedido.valorFinal());

		scanner.close();

	}

}
