package Generics_Api;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
==================== CONCEITOS IMPORTANTES EM JAVA ====================

1) O QUE É API?
--------------------------------------------------
API significa Application Programming Interface.

Na prática, uma API é um conjunto de classes e métodos prontos
que a gente usa para resolver problemas sem precisar saber
como tudo funciona por baixo dos panos.

Exemplos de APIs em Java:
- Collections (List, Set, Map)
- Streams
- Scanner
- Data e Hora (LocalDate, LocalDateTime)
- APIs de frameworks como Spring e Hibernate

Uso no dia a dia:
Você já usa API o tempo todo.
Quando usa Scanner, List ou Stream, já está usando uma API.

Quando usar:
Sempre que existir algo pronto, testado e organizado,
em vez de criar tudo do zero.


2) O QUE SÃO GENERICS?
--------------------------------------------------
Generics permitem que classes e métodos funcionem com
tipos diferentes, definidos no momento do uso.

Ou seja, você diz qual tipo aquela estrutura vai aceitar.

Exemplo:
List<String> nomes;
List<Integer> numeros;

Para que servem?
- Evitam erros de tipo em tempo de execução
- Eliminam casts desnecessários
- Deixam o código mais seguro e reutilizável

Uso na prática:
- List<String> → lista de textos
- List<Usuario> → lista de usuários
- Repository<T> → muito usado com banco de dados

Quando usar:
Quando a lógica for a mesma, mas o tipo do dado pode mudar.


3) O QUE SÃO STREAMS?
--------------------------------------------------
Streams fazem parte da API java.util.stream.

Fluxo : dados → stream → processamento → resultado

Elas servem para trabalhar com coleções de forma mais
simples, legível e moderna, sem ficar criando vários loops.

Com Streams é possível:
- Filtrar dados
- Transformar informações
- Ordenar
- Agrupar
- Somar, contar ou calcular médias

Tudo isso sem usar for ou while diretamente.

Exemplos práticos:
- Filtrar usuários maiores de idade
- Calcular média de valores
- Buscar registros específicos
- Transformar objetos

Uso na vida real:
- Dados vindos do banco
- Respostas de APIs
- Relatórios
- Regras de negócio

Quando usar:
Quando estiver trabalhando com listas e precisar filtrar
ou transformar dados de forma clara.


4) RELAÇÃO ENTRE API, GENERICS E STREAMS
--------------------------------------------------
- Streams são uma API
- Streams usam Generics
- Generics garantem segurança de tipo

Exemplo simples:
Uma List<Usuario> pode virar um Stream<Usuario>

Tudo isso faz parte do ecossistema do Java moderno.


5) RESUMÃO FINAL
--------------------------------------------------
API      → funcionalidades prontas
Generics → segurança e reutilização
Streams  → processamento moderno de coleções

Esses conceitos são base para:
- Java atual
- Spring Boot
- Backend
- Projetos reais

=======================================================================
*/

public class Main {

	public static void main(String[] args) {
		// Entrada de dados
		Scanner scanner = new Scanner(System.in, "UTF-8");

		// Criando o Repositório
		Repositorio<Pedido> repositorio = new Repositorio<>();

		System.out.print("Quantos pedidos deseja cadastrar? ");
		int qtd = scanner.nextInt();
		scanner.nextLine(); // limpa buffer

		// Cadastrando pedidos
		for (int i = 0; i < qtd; i++) {
			System.out.print("Nome do pedido: ");
			String nome = scanner.nextLine();

			System.out.print("Valor do pedido: ");
			BigDecimal valor = new BigDecimal(scanner.nextLine());

			// Criando pedidos
			Pedido pedido = new Pedido(nome, valor);

			System.out.print("Deseja adicionar observação? (s/n): ");
			String resp = scanner.nextLine();

			if (resp.equalsIgnoreCase("s")) {
				System.out.print("Observação: ");
				pedido.definirObservacao(scanner.nextLine());
			}

			repositorio.adicionar(pedido);
		}

		// Retornando dados
		List<Pedido> pedidos = repositorio.listar();

		// Aplicando STREAMS

		System.out.println("\nPedidos acima de R$ 100:");

		pedidos.stream().filter(p -> p.getValor().compareTo(new BigDecimal("100")) > 0).forEach(System.out::println);

		// Soma total

		// Soma total (reduce)
		BigDecimal total = pedidos.stream().map(Pedido::getValor).reduce(BigDecimal.ZERO, BigDecimal::add);

		System.out.println("\nTotal dos pedidos: R$ " + total);

		// Pedido mais caro
		pedidos.stream().max(Comparator.comparing(Pedido::getValor))
				.ifPresent(p -> System.out.println("\nPedido mais caro: " + p));

		// Verifica se existe pedido barato
		boolean existeBarato = pedidos.stream().anyMatch(p -> p.getValor().compareTo(new BigDecimal("50")) < 0);

		System.out.println("\nExiste pedido abaixo de R$ 50? " + existeBarato);

		scanner.close();

	}

}
