package Exerc;

import java.math.*;
import java.text.*;
import java.util.*;

public class ExercJava110925 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        while (true) {
            System.out.println("Olá, informe seu nome:");
            name = sc.nextLine();

            System.out.println("Olá " + name + "! Gostaria de consultar seu saldo? S/N");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("N")) break;

            System.out.println("Digite seu saldo:");
            String saldoStr = sc.nextLine();
            BigDecimal saldo = new BigDecimal(saldoStr).setScale(2, RoundingMode.HALF_UP);

            // Formata para exibição
            DecimalFormat df = new DecimalFormat("#,##0.00");
            System.out.println("Seu saldo é: R$ " + df.format(saldo));

            BigDecimal cheque;
            if (saldo.compareTo(new BigDecimal("500.00")) == 0) {
                cheque = new BigDecimal("50.00");
            } else {
                cheque = saldo.multiply(new BigDecimal("0.5")).setScale(2, RoundingMode.HALF_UP);
            }

            System.out.println("O valor do cheque será: R$ " + df.format(cheque));
            System.out.println("Olá " + name + "! Você atingiu o limite de cheque especial? S/N");
            String resposta2 = sc.nextLine();
            if (resposta2.equalsIgnoreCase("N")) break;
            System.out.println("Você será cobrado com uma taxa de 20% do valor usado do cheque especial:");
            // Declarando cobrança
            BigDecimal cobrado = cheque.multiply(new BigDecimal("0.2")).setScale(2, RoundingMode.HALF_UP);
            // Formatação
            // Não precisa usar isso de novo
            //  DecimalFormat df = new DecimalFormat("#,##0.00");
            System.out.println("Sua cobrança é: R$ " + df.format(cobrado));
            
        }

        sc.close();
        System.out.println("Programa encerrado!");
    }
}

		
		//  Cheque especial é um valor emprestado
		// do banco para saldo negativo
		// Fórmula do juros do Cheque especial
		// Juros = Valor utilizado x Taxa diária x Tempo em dias
		// 1) Converter a taxa para uma taxa diária
		// Dividindo pelo número de dias no mês (30)
		// 2) Multiplicar o valor ultilizado pelo
		// valor decimal da taxa diária
		// 3) multiplique o resultado pelo número de dias
		// que o saldo esteve negativo. 
		// Exemplo: Se os juros diários foram de R$ 2,00 e
		// você ficou usando por 15 dias
		// os juros totais são R$ 2,00 x 15 dias = R$ 30,00. 
	    
//  DecimalFormat df = new DecimalFormat("#,##0.00"); // só precisa criar uma vez

//  saldo = new BigDecimal("1234.567").setScale(2, RoundingMode.HALF_UP);
//  BigDecimal cheque = new BigDecimal("50.0");

//  System.out.println("Saldo: R$ " + df.format(saldo));
 //   System.out.println("Cheque: R$ " + df.format(cheque));
// ✅ Explicação:

// df.format(valor) faz a formatação na hora de imprimir, não altera o valor em si.

// Não é necessário declarar várias vezes; declarar uma vez e reutilizar é mais limpo e eficiente.




