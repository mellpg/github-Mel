package Autobox_Unbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Lista de notas → só aceita OBJETOS
		// Integer = wrapper -> não aceita int
		List<Integer> notas = new ArrayList<>();

		System.out.println("Digite notas (ou -1 para sair): ");

		while (true) {
			int entrada = sc.nextInt();
			// ↑ Scanner retorna primitivp (int)

			if (entrada == -1) {
				break;
			}

			// AUTOBOXING acontecendo aqui:
			// entrada (int) → vira Integer automaticamente
			notas.add(entrada);
		}

		System.out.println("\nNotas cadastradas: " + notas);

		// Média(com unboxing dentro do for)
		int soma = 0;

		for (Integer n : notas) {
			// UNBOXING acontecendo aqui:
			// n (Integer) → vira int para somar
			soma += n;
		}

		// UNBOXING aqui novamente:
		// notas.size() retorna int, mas soma é primitivo, então ok
		double media = (double) soma / notas.size();

		System.out.println("Média: " + media);

		// OUTRO CASO REAL: obter valor de wrapper e enviar para método
		Integer maiorNota = pegarMaiorNota(notas);

		// UNBOXING aqui para imprimir:
		System.out.println("Maior nota: " + maiorNota);

		sc.close();
	}

	// Método recebe wrapper Integer
	public static Integer pegarMaiorNota(List<Integer> lista) {

		// Se você mandar um "int" pra esse método, vai virar Integer (autoboxing)

		Integer maior = 0;

		for (Integer n : lista) {
			// UNBOXING dentro de comparação
			if (n > maior) { // n e maior são Integer, mas viram int aqui
				maior = n; // apenas atribuição entre wrappers
			}
		}
		return maior; // retorna wrapper
	}
}
