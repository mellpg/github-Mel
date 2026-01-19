package Exerc_Heran_Polim_Dio;
import java.util.*;
// exerc 1
public class Exerc_Heran_Polim_Dio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedindo informações do ingresso
        System.out.println("Digite o nome do filme:");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do ingresso\n");
        double valor = sc.nextDouble();
        sc.nextLine(); // limpa o buffer do teclado
        System.out.print("O filme é 'Legendado' ou 'Dublado'? ");
        String dubLeg = sc.nextLine();
        System.out.println("Digite o tipo de ingresso(1 - Meia, 2 - Família):\n");
        int tipo = sc.nextInt();
        sc.nextLine(); // limpar buffer

        // Declarando variável Ingresso
        Ingresso ingresso;
        // Criar objeto dependendo da escolha
        switch(tipo) {
            case 1 -> ingresso = new Meia(valor,nome,dubLeg);
            case 2 -> {
                System.out.println("Digite o número de pessoas");
                int pessoas = sc.nextInt();
                ingresso = new Familia(valor, nome, dubLeg, pessoas);
            }
            default -> ingresso = new Meia(valor, nome, dubLeg);
        }
        // Imprimir dados
        printIngresso(ingresso);
    }
// recebe o objeto ingresso e verifica seu tipo 
    public static void printIngresso(Ingresso ingresso) {
        switch(ingresso) {
            case Meia meia -> {
                System.out.println("Filme: " + meia.getName());
                System.out.println("Valor da meia: " + meia.getFullValor());
                System.out.println("Legendado/Dublado: " + meia.getDubLeg());
            }
            case Familia familia -> {
            	System.out.println("Filme: " + familia.getName());
                System.out.println("Número de pessoas: " + familia.numeroDePessoas());
                System.out.println("Valor total: " + familia.getFullValor());
                System.out.println("Legendado/Dublado: " + familia.getDubLeg());
            }
        }
    }
}
