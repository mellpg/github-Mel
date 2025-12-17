package tiposPrimitivos_Wrapp;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Tipos primitivos e Wrappers

		// Tipos primitivos -> Valores simples, não
		// são objetos
		// rápidos e ocupam pouca memória

		// minúsculo -> tipo primitivo
		// maiúsculo -> classe Wrapper (objeto)
		int numeroPrimitivo = 10; // guarda o valor de forma direta
		double salarioPrimitivo = 2500.50; // não tem métodos, só armazena o valor
		boolean ativoPrimitivo = true; // não aceita valor nulo (null)

		// Wrappers -> Cada tipo primitivo tem sua
		// classe equivalente ( Integer, Double, Boolean...)
		// Wrappers são objetos e possuem métodos úteis

		Integer numeroWrapper = 10; // classe Integer (wrapper do int)
		Double salarioWrapper = 2500.50; // classe Double (wrapper do double)
		Boolean ativoWrapper = true; // classe Boolean (wrapper do boolean)

		// Vantagens dos wrappers

		// 1) Wrappers aceitam valores nulos (primitivos NÃO aceitam).
		Integer podeSerNulo = null;
		// int naoPodeSerNulo = null; // ERRO → primitivo não aceita null

		// 2) Wrappers possuem MÉTODOS úteis.
		// Exemplo: converter texto para número
		int convertido = Integer.parseInt("50"); // parseInt é um método da classe Integer

		// 3) Wrappers são necessários em coleções (ArrayList, HashMap...)
		// Coleções funcionam somente com OBJETOS
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(10); // funciona → Integer é objeto
		// lista.add(10); // se fosse tipo primitivo, não poderia

		// Autoboxing e unboxing
		// Autoboxing: Java converte automaticamente primitivo -> wrapper

		Integer caixa = numeroPrimitivo; // int virou Integer automaticamente

		// Unboxing: Java converte automaticamente wrapper -> primitivo

		int foraDaCaixa = numeroWrapper; // Integer virou int automaticamente

		// Quando é usado?

		// Autoboxing
		// -> Adicionar primitivo em uma coleção
		// ->Enviar primitivo para método que espera wrapper
		// -> Trabalhar com APIs (Optional, Streams)
		// -> Salvar números vindos do Scanner em coleções

		// Unboxing
		// ->Fazer contas com Integer, Double, etc.
		// -> Pegar valores de Map/List e usar em operações matemáticas
		// -> Passar wrapper para método que espera primitivo
		// -> Comparar valores wrapper com primitivos

		System.out.println("Primitivo int: " + numeroPrimitivo);
		System.out.println("Wrapper Integer: " + numeroWrapper);
		System.out.println("Convertido de String p/ int: " + convertido);
		System.out.println("Lista de Integer: " + lista);
		System.out.println("Autoboxing (int -> Integer): " + caixa);
		System.out.println("Unboxing (Integer -> int): " + foraDaCaixa);

	}

}
