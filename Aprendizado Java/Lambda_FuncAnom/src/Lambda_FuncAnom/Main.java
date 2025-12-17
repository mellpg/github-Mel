package Lambda_FuncAnom;

import java.util.Scanner;

// Interface funcional -> Só tem 1 método abstrato
//  Lambdas só funcionam com esse tipo de interface.
@FunctionalInterface
interface operation {
	int exe(int a, int b);
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		int a = sc.nextInt();

		System.out.println("Digite o segundo valor:");
		int b = sc.nextInt();
		// O que é lambda?
		// É uma função sem anônima (sem nome)
		// de forma curta para facilitar
		// Sintaxe: (parametros) -> resultado ou bloco de código
		// Sintaxe: (parametros) -> resultado ou bloco de código
		// Quando se deve usar?
		// Quando se precisa de uma tarefa simples
		// e de uso único
		// Exemplos: map(), filter(), reduce() e sort()
		// Python, JavaScript, Java, C#, etc. As lambdas evitam a criação
		// de funções nomeadas apenas para essa finalidade [1].
		// Clique de botão, Closures e Callback e Usar uma lambda como valor
		// padrão ou opcional para um parâmetro de função

		// Aplicando:

		operation sum = (x, y) -> x + y;

		// Usando nosso lambda
		int result = sum.exe(a, b);

		System.out.println("O resultado foi: " + result);

	}

}
