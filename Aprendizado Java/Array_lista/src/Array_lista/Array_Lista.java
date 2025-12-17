package Array_lista;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Lista {

	public static void main(String[] args) {
		// Array ( tamanho fixo )
		int[] num = { 10, 20, 30 };

		// Acessando valores usando For-each
		for (int x : num) {
			System.out.println(x);
		}

		// Trocando valores ( set )
		// manualmente
		num[1] = 500;

		// Mostrando o tamanho
		// length é um atributo
		// não é um método
		System.out.println("Tamanho do array: " + num.length);

		// Melhor forma de imprimir o array:
		System.out.println("Imprimindo de forma mais simpples\n" + "Conteúdo do array: " + Arrays.toString(num));

		// Copiando array para aumentar tamanho (array não cresce sozinho)
		// vai criar um novo array com tamanho 8
		// como o original é menor, as posicões extras
		// serão preenchidas com seu valor padrão
		int[] copiaNum = Arrays.copyOf(num, 8);
		System.out.println("Array maior: " + Arrays.toString(copiaNum));

		// Percorrendo array com for tradicional
		System.out.println("Percorrendo com for tradicional:\n");
		for (int i = 0; i < num.length; i++) {
			System.out.println("Posição " + i + ": " + num[i]);
		}

		// Percorrendo com for-each

		System.out.println("Percorrendo com for-each:\n");

		for (int valor : num) {
			System.out.println("Valor: " + valor);
		}

		// ARRAY-LIST ( Mais usado e dinâmico)

		// array-list de Strings

		ArrayList<String> nomes = new ArrayList<>();

		// ADD — adicionando valores
		nomes.add("Mel");
		nomes.add("Yasmin");
		nomes.add("Maria");
		nomes.add("Wilson");
		nomes.add("Rosiane");

		// Add index - adicionar em posição específica
		nomes.add(1, "Mel");
		nomes.add(2, "Yasmin");
		nomes.add(3, "Maria");
		nomes.add(4, "Wilson");
		nomes.add(5, "Rosiane");

		System.out.println("\nArrayList após adições: " + nomes);

		// Get - Acessando pelo índice
		System.out.println("\nAcessando pelos índices");
		System.out.println("Primeiro nome: " + nomes.get(0));
		System.out.println("Segundo  nome: " + nomes.get(1));
		System.out.println("Terceiro nome: " + nomes.get(2));
		System.out.println("Quarto nome: " + nomes.get(3));
		System.out.println("Quinto nome: " + nomes.get(4));

		// Set - alterando valor
		nomes.set(4, "Pedro");
		System.out.println("ArrayList após set: " + nomes);

		// Remove — pelo valor
		nomes.remove("Carlos");

		// Remove — pelo índice
		nomes.remove(1);

		System.out.println("ArrayList após remoções: " + nomes);

		// Size - quantidade de elementos
		System.out.println("Tamanho do ArrayList: " + nomes.size());

		// Contains -Verificar se ainda contém algum nome
		System.out.println("Contém 'Mel'? " + nomes.contains("Mel"));

		// Indexof - posição de um elemento
		System.out.println("Índice de 'Yasmin': " + nomes.indexOf("Yasmin"));

		// Isempty— lista vazia?
		System.out.println("Está vazio? " + nomes.isEmpty());

		// IMPORTANTE!
		// FOREACH — FORMA MODERNA DE PERCORRER
		System.out.println("\nPercorrendo lista com forEach:");
		nomes.forEach(nome -> System.out.println(nome));

		// Toarray - converte lista para array
		String[] nomesArray = nomes.toArray(new String[0]);
		System.out.println("Lista convertida em array: " + Arrays.toString(nomesArray));

		// Clear - limpar lista
		nomes.clear();
		System.out.println("\nArrayList após clear(): " + nomes);
		System.out.println("Está vazio? " + nomes.isEmpty());

	}

}
