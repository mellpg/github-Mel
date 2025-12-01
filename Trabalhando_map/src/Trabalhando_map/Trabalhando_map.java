package Trabalhando_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
// Entry é uma interface estática interna dentro de Map
// tem que importar especificamente de vez em quando
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Trabalhando_map {

	// Map é uma estrutura de dados que associa chaves a valores
	// sendo cada chave única e aponta pra um valor
	// diferentes das Arraylists e Linkedlist, não tem índice numérico
	// você acessa pela key

	public static void main(String[] args) {
		// HashMap

		Map<String, Integer> hashMapIdades = new HashMap<>();

		// Adicionando elementos ( chave -> valor)
		hashMapIdades.put("Mel", 25);
		hashMapIdades.put("Yasmin", 30);
		hashMapIdades.put("Carlos", 40);

		// Acessando valores através das chaves
		System.out.println("=== HashMap ===");
		System.out.println("HashMap - Idade da Mel: " + hashMapIdades.get("Mel"));
		System.out.println("HashMap - Idade da Yasmin: " + hashMapIdades.get("Yasmin"));
		System.out.println("HashMap - Idade do Carlos: " + hashMapIdades.get("Carlos"));

		// Verificando se uma chave existe
		if (hashMapIdades.containsKey("Yasmin")) {
			System.out.println("HashMap - Yasmin está no map!");
		}

		// Removendo elemento
		hashMapIdades.remove("Carlos");

		System.out.println("=== Percorrendo HashMap ===");

		// Percorrendo o Map
		// Cada entrySet() é um Map.entry que contém -> chave(String) + valor(Integer)
		// for(Tipo item : coleção)
		// O hashMapIdades.entrySet() CONVERTE o HashMap em um
		// conjunto (Set) de entradas (key-value)
		// entrySet() é um método do HashMap/Map
		// Ele retorna um Set contendo todos os pares chave-valor (Map.Entry)
		// ou seja , uma interface de coleção que não retorna elementos duplicados
		// cada chave é única
		// entry -> representa cada elemento do Set ( cada par)
		for (Entry<String, Integer> entry : hashMapIdades.entrySet()) {
			System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
		}

		System.out.println("HashMap - Tamanho do map: " + hashMapIdades.size());

		// LinkedHashMap
		// ele mantém a ordem de inserção

		System.out.println("=== LinkedHashMap ===");

		Map<String, Integer> linkedHashMapIdades = new LinkedHashMap<>();

		linkedHashMapIdades.put("lucas", 25);
		linkedHashMapIdades.put("Andressa", 34);
		linkedHashMapIdades.put("Mel", 19);

		System.out.println("=== Percorrendo linkedHashMap === ");
		for (Map.Entry<String, Integer> entry : linkedHashMapIdades.entrySet()) {
			System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
		}
		System.out.println("LinkedHashMap - Tamanho do map: " + linkedHashMapIdades.size());

		// Quando usar LinkedHashMap?
		// Quando os elementos precisam permanecer na mesma ordem
		// na qual foram inseridos
		// Exemplos: histórico de acessos, lista de ordem de chegadas, etc.

		System.out.println("=== TreeMap ===");
		// TreeMap
		// Ele mantém as chaves ordenadas
		// put é como se fosse "input" ele cria o mapa
		// put não lê do teclado, não é input do usuário
		// se você fizer put do valor na mesma chave, o valor
		// será sobreescrito
		// put(key, value) -> adiciona ou atualiza um elemento no Map
		Map<String, Integer> treeMapIdades = new TreeMap<>();

		treeMapIdades.put("Vitória", 25);
		treeMapIdades.put("Alexandre", 30);
		treeMapIdades.put("Ricardo", 40);

		// Via Scanner
		System.out.println(" === Inserindo dados via Scanner ===");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Digite o nome:");
			System.out.println("Ou 'sair' para encerrar o programa:\n ");
			String nome = sc.nextLine();
			if (nome.equalsIgnoreCase("sair")) {
				break;
			}

			System.out.println("Digite a idade");
			int idade = sc.nextInt();
			sc.nextLine(); // boas práticas de programação, vai consumir quebra de linha

			treeMapIdades.put(nome, idade);

		}
		System.out.println("=== TreeMap ===");
		System.out.println("\nLista de pessoas e idades:");
		for (Map.Entry<String, Integer> entry : treeMapIdades.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}

		System.out.println("TreeMap - Tamanho do map: " + treeMapIdades.size());

		// Quando usar o TreeMap?
		// Quando é necessário que as chaves fiquem em ordem automaticamente
		// Exemplos: ordem alfabética, numérica, rankings , situações que a ordem
		// precisa ser automática

		// Aula
		Map<String, User> user = new HashMap<>();
		user.put("mel@mel.com", new User("Mel", 19));
		user.put("yasmin@1385.com", new User("Yasmin", 19));
		user.put("bruno@13789.com", new User("Bruno", 29));
		user.put("wilson@bmy1408.com", new User("Wilson", 69));
		System.out.println(user);
		System.out.println("=== Percorrendo com ForEach ===");
		user.keySet().forEach(System.out::println);
		user.values().forEach(System.out::println);

		// Merge()
		// Serve para atualizar valores
		// Se a chave existir -> atualiza usando o lambda
		// Se não existir -> Adiciona o valor novo
		user.merge("mel@mel.com", // chave
				new User("Mel", 20), // valor caso a chave NÃO exista
				(userAntigo, userNovo) -> { // função para mesclar caso a chave JÁ exista
					return new User(userAntigo.name(), // mantém o nome anterior
							userAntigo.age() + 1 // soma 1 à idade
					);
				});

		System.out.println("\nDepois do merge:");
		System.out.println(user);

	}

}
