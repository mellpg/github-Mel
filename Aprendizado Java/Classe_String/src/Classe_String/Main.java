package Classe_String;

public class Main {

	public static void main(String[] args) {
		// Classe String -> É uma classe
		// imutável, ao modificar uma string, o java
		// cria um novo objeto
		// Usado para os textos em geral

		String name = "Mel";
		String greeting = "Oi!" + name;

		// O java nesse momento, criou novas String internamente (sua imutabilidade)

		// Alguns métodos:
		System.out.println("=== Classe String ===");
		System.out.println("length(): " + name.length()); // tamanho
		System.out.println("charAt(): " + name.charAt(0)); // letra da posição
		System.out.println("substring(): " + name.substring(1)); // parte da string
		System.out.println("equals(): " + name.equals("Mel Pereira")); // compara igual
		System.out.println("toUpperCase(): " + name.toUpperCase()); // tudo maiúsculo
		System.out.println("toLowerCase(): " + name.toLowerCase()); // tudo minúsculo
		System.out.println("contains(): " + name.contains("Pere")); // contém trecho?
		System.out.println("startsWith(): " + name.startsWith("Mel")); // começa com?
		System.out.println("endsWith(): " + name.endsWith("ira")); // termina com?
		System.out.println("indexOf(): " + name.indexOf("e")); // primeira posição
		System.out.println("lastIndexOf(): " + name.lastIndexOf("e")); // última posição
		System.out.println("replace(): " + name.replace("Mel", "Yasmin")); // substituir
		System.out.println("trim(): " + "   teste   ".trim()); // remove espaços laterais

		// Métodos avançados

		System.out.println("replaceAll(regex): " + name.replaceAll("[aeiou]", "*"));
		// troca todas as vogais por '*', usando REGEX

		System.out.println("split(): " + java.util.Arrays.toString(name.split(" ")));
		// divide a string em palavras

		System.out.println("join(): " + String.join(" - ", "Java", "Python", "C#"));
		// junta várias strings com separador

		System.out.println("repeat(): " + "=-".repeat(5));
		// repete a string 5x

		// Métodos aplicados em sistemas reais
		String email = "mel.pereira@gmail.com";
		System.out.println("matches(regex): " + email.matches(".*@gmail\\.com"));
		// valida se é gmail usando REGEX

		String cpf = "123.456.789-00";
		System.out.println("replaceAll limpar cpf: " + cpf.replaceAll("\\D", ""));
		// remove tudo que não é número

		String texto = "Java é rápido e Java é poderoso";
		System.out.println("replaceFirst(): " + texto.replaceFirst("Java", "Python"));
		// troca só a primeira ocorrência

		// Quando usar?
		// Quando o texto não é alterado com frequência
		// Ex.: nome de usuário, CPF, mensagens fixas

		// Stringbuilder ->
		// É uma classe mutável
		// Pode realizar alteração no texto sem criar novos objetos
		// mais rápido que String para muitas concatenações ( união de elementos)
		// não é sincronizado (não é "thread-safe")
		// thread-safe -> propriedade de um código que garante que ele pode ser acessado
		// e executado simultaneamente por várias threads ou linhas de execução
		// sem causar erros corrupção de dados ou comportamento inesperado

		// Sua aplicação na programação:
		// Montar reçatórios grandes , gerar JSO Nou textos em loops
		// realizar muitas concatenações dentro do For

		System.out.println("=== Stringbuilder ===");
		StringBuilder sb = new StringBuilder("Texto inicial");
		sb.append(" + mais texto"); // append() adiciona
		sb.insert(0, ">> "); // insert() adiciona em posição
		sb.reverse(); // reverse() inverte toda a String

		System.out.println("StringBuilder: " + sb.toString());

		// Stringbuffer
		// Semelhante com Stringbuilder
		// mutável, sincronizado, é thread-safe
		// Usado quando várias threads acessam o texto ao mesmo tempo

		// Aplicações na vida real:
		// Sistemas bancários multi-thread e logs compartilhados

		System.out.println("=== Stringbuffer ===");
		StringBuffer sbf = new StringBuffer("Log:");
		sbf.append(" Operação realizada");

		System.out.println("StringBuffer: " + sbf.toString());

		// Texto fixo: String
		// Texto vai ser alterado várias vezes? : Stringbuilder
		// Texto alterado por várias threads? : Stringbuffer

	}

}
