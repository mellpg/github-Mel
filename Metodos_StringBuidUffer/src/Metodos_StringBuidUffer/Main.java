package Metodos_StringBuidUffer;

public class Main {

	public static void main(String[] args) {
		// Métodos Stringbuilder

		// mutável, rápido, NÃO é thread-safe

		StringBuilder sb = new StringBuilder("Java");
		sb.append(" é bom"); // append() → adiciona algo no final (melhor que String + String)

		sb.insert(0, ">> "); // insert() → insere texto em uma posição específica

		sb.delete(2, 4); // delete(início, fim) → remove caracteres em um intervalo

		sb.deleteCharAt(0); // deleteCharAt() → remove somente 1 caractere da posição informada

		sb.replace(0, 3, "PY"); // replace(início, fim, texto) → substitui trecho específico

		sb.reverse(); // reverse() → inverte a String inteira (muito usado em algoritmos

		sb.setLength(10); // setLength(n) → corta ou completa a String para o tamanho desejado
							// se o texto for menor, ele completa com '\u0000'
		System.out.println("StringBuilder final: " + sb.toString());

		// Métodos Stringbuffer

		// Obs: possui os mesmos métodos que builder, só que mais lento

		StringBuffer sbf = new StringBuffer("Banco de Dados"); // append → concatena com segurança entre threads

		sbf.insert(5, "[LOG]"); // insert → útil quando adiciona marcações no meio
		// vai deixar assim:
		// B a n c o d e D a d o s
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13

		// O 5 é o espaço

		sbf.replace(0, 5, "SERVER"); // replace → troca trecho específico

		sbf.delete(0, 3); // delete → remove intervalos

		sbf.reverse(); // reverse → inverter string de forma thread-safe

		sbf.setCharAt(0, '*'); // setCharAt → altera somente um caractere específico

		System.out.println("StringBuffer final: " + sbf.toString());

		StringBuilder sbCap = new StringBuilder(100); // capacity(100) → aloca espaço interno para 100 caracteres sem
														// crescer
														// melhora na perfomance quando sabemos o tamanho final

		sbCap.append("Construindo texto muito grande sem realocar memória.");
		System.out.println("Capacidade atual: " + sbCap.capacity());
		// capacity() → mostra o tamanho interno do buffer

		sbCap.trimToSize(); // trimToSize() → reduz a capacidade para caber exatamente o texto

		System.out.println("Capacidade após trimToSize: " + sbCap.capacity());

	}
}
