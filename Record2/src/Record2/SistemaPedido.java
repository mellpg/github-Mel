package Record2;

/*
 * Record é um tipo especial de classe, criado para
 * guardar dados imutáveis
 
 Como por exemplo:
 
 Dados de um usuário

 Dados de um produto

 Dados de uma compra

 Dados que vêm de uma API

 Dados que vão para o banco
 
 O record por si só já cria:
 
 public record Pessoa(String nome, int idade) {}
 
 O Java cria automaticamente:

 atributos final

 construtor

 getters (sem get)

 equals

 hashCode

 toString
 
 O record é imutável , depois de criado, não pode ser alterado
 
 Quando usar Record:
 
 Quando precisamos carregar dados, dados não mudam ,
 código mais limpo, trabalho com DTO, retorno de API, leitura de dados
 
 Quando não usar Record:
 
 Quando dados mudam com o tempo, precisa do uso de setters
 muita lógica de negócio
 
 Aplicação na vida real:
 
 Sistema de pedidos: O pedido tem o nome do cliente,
 produto e valor, depois de feito o pedido, esses dados não mudam
 o record nesse caso é o ideal
 
 */

public class SistemaPedido {

	// Criando o Record
	public record Pedido(String nomeCliente, String produto, double valor) {

		/*
		 * Records podem ter métodos O que não podem ter é Setters
		 */
		public double calcularTaxaServico() {
			return valor * 0.10;
		}

		public double valorFinal() {
			return valor + calcularTaxaServico();
		}

	}

}
