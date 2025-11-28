package Trabalhando_Listas_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Trabalhando_Listas_Arrays {

	public static void main(String[] args) {

		// Criando lista User

		List<User> users = new ArrayList<>();
		var user = new User(1, "Mel");
		users.add(user);
		users.add(new User(2, "Yasmin"));
		// Exemplos de métodos
		System.out.println(users.getFirst());
		System.out.println("\n");
		System.out.println(users.getLast());

		// Array - Alta perfomance/ tamanho fixo

		int[] numerosArray = new int[3];
		numerosArray[0] = 10;
		numerosArray[1] = 20;
		numerosArray[2] = 30;

		System.out.println("=== ARRAY ===");
		for (int num : numerosArray) {
			System.out.println("Número do array: " + num);
		}

		// ArrayList - Lista que cresce ou diminui, sem tamanho fixo
		// não aceita tipos primitivos, por isso uso do Integer, só
		// só aceita objetos
		// Integer -> (classe wrapper do int)

		ArrayList<Integer> numerosLista = new ArrayList<>();

		// Adicionando elementos (cresce sozinho)
		numerosLista.add(10);
		numerosLista.add(20);
		numerosLista.add(30);

		// Removendo elemento
		numerosLista.remove(1); // remove o valor 20

		// Acessando elemento
		int primeiroElemento = numerosLista.get(0);

		System.out.println("\n=== ARRAYLIST ===");
		System.out.println("Primeiro elemento: " + primeiroElemento);

		for (Integer valor : numerosLista) {
			System.out.println("Valor da lista: " + valor);
		}

		// Integer
		// Existe para representar números como objetos
		// Útil quando queremos guardar um número que pode ser null
		// métodos adicionais e comleções como arraylist<Integer>

		Integer idade = 19;

		System.out.println("\n=== INTEGER ===");
		System.out.println("Idade: " + idade);
		System.out.println("Maior valor possível: " + Integer.MAX_VALUE);
		System.out.println("Convertendo String para Integer: " + Integer.parseInt("123"));

		// Vector - Lista sincronizada
		// Frequente alterações dos valores, segurança de acesso
		// Lista compartilhada entre threads (programação paralela), hoje em dia é menos
		// usado
		// arraylist é mais comum

		Vector<String> nomes = new Vector<>();

		nomes.add("Ana");
		nomes.add("Carlos");
		nomes.add("Maria");

		System.out.println("\n=== VECTOR ===");
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}

		// Diferença entre equals() e ==

		// 1) == -> Compara referências ( endereços de memória )

		/*
		 * User u1 = new User(); User u2 = new User();
		 * 
		 * System.out.println(u1 == u2); // false
		 * 
		 * // mesmo conteúdo, mas objetos diferentes
		 * 
		 */

		// 2) Equals() -> Vai comparar se os objetos representam a mesma coisa
		// obs: se você sobreescrever -> você define o que significa dois objetos serem
		// iguais
		// se não -> equals() funciona igual ao ==
		/*
		 * String s1 = new String("oi"); String s2 = new String("oi");
		 * 
		 * System.out.println(s1.equals(s2)); // true (conteúdo igual)
		 * System.out.println(s1 == s2); // false (endereços diferentes) /*
		 */

		var u1 = new User(1, "Mel");
		var u2 = new User(1, "Mel");
		var u3 = u1;

		System.out.println(u1.equals(u2)); // true (conteúdo igual)
		System.out.println(u1.equals(u3)); // true (mesmo objeto)
		// get(1) é o Yasmin
		System.out.println(u1.equals(users.get(1))); // false (conteúdo diferente)

		// Testando equals()
		System.out.println("=== Testando equals() ===");
		System.out.println(users.contains(new User(1, "Mel")));
		System.out.println(new User(1, "Mel").equals(new User(1, "Mel")));

		// Mostrando a lista
		System.out.println("=== Retornando a Lista ===");
		System.out.println(users);

	}

}
