package ArrayLista2_InterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// HashSet é uma coleçao de dados que não permite duplicados!
		Set<User> users = new HashSet<>();
		users.add(new User(1, "Mel"));
		users.add(new User(2, "Melissa"));
		users.add(new User(3, "Melanie"));
		users.add(new User(55, "Marcos"));
		users.add(new User(29, "Marta"));

		// Exige o método hashCode()
		// Ele retorna um int, identifica um objeto de forma única
		// no caso com seu hashCode
		// recuperação de objetos eficiente

		System.out.println(" === HashCode() ===");

		System.out.println("Código hash: " + new User(1, "Mel").hashCode());
		System.out.println("Código hash: " + new User(2, "Melissa").hashCode());
		System.out.println("Código hash: " + new User(3, "Melanie\"").hashCode());
		System.out.println("Código hash: " + new User(55, "Marcos").hashCode());
		System.out.println("Código hash: " + new User(29, "Marta").hashCode());
		System.out.println(users.contains(new User(1, "Mel")));

		users.forEach(System.out::println);

		System.out.println(" === Usando Iterator === ");
		// Iterator é um objeto que permite percorrer
		// a coleção passo a passo, com controle total
		// ideal para dentro de um HashSet, HashMap, LinkedList etc

		// Criando o iterador, como se fosse um cursor para percorrer
		// pedindo ao HashSet que nos dê um “percursor”
		// HashSet cria um objeto interno capaz de
		// saber qual é o próximo elemento, avançar e dizer se ainda tem
		var iterator = users.iterator();

		// Enquanto houver elemnentos para ler, vai avançar
		while (iterator.hasNext()) {
			// Tem que colocar o Next, o iterator é so o cursor
			System.out.println(iterator.next());
		}

	}

}
