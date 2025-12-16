package ConceitoLista;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Listas são uma interface da Java Collections Framework
		// representa uma coleção ordenada de elementos
		// diferente de arrays, elas podem aumentar ou diminuir de
		// forma dinâmica

		// Exemplos
		// Criando uma lista usando ArrayList (uma das implementações mais usadas de
		// List)

		// Quando de usar lista?
		// não se sabe o tamanho final do storage de valores, acessar
		// pelo índice, não serve para velocidade extrema de acessos

		List<String> nomes = new ArrayList<>();

		nomes.add("Mel");
		nomes.add("Yasmin");
		nomes.add("Carlos");

		// Exibindo todos os elementos
		System.out.println("Lista de nomes:");
		System.out.println(nomes);

		// Percorrendo com for-Each:
		// não vai mostrar o índice e nem mudar posição
		System.out.println("=== Percorrendo com for-Each: ===");
		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
