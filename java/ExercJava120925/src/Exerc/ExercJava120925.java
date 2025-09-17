package Exerc;

import java.util.Scanner;

public class ExercJava120925 {

    // Criamos um Scanner global (static) para ler dados digitados pelo usuário
    private final static Scanner scanner = new Scanner(System.in);
    
    // Criamos a máquina de pets (objeto único que será usado no programa inteiro)
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        int option = -1; // variável para armazenar a opção do menu

        do {
            // Menu de opções
            System.out.println("\n=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar a água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("10 - Sair");
            System.out.print("Digite a opção: ");

            // Lê a opção digitada pelo usuário
            option = scanner.nextInt();

            // Switch para tratar cada opção do menu
            switch (option) { 
                case 1: 
                    // Dá banho no pet (usa água e shampoo da máquina)
                    petMachine.takeShowerInAPet();
                    // OBS: aqui não tem break, então depois de executar cai direto no próximo case
                case 2:
                    // Coloca água na máquina
                    setWater();
                case 3:
                    // Coloca shampoo na máquina
                    setShampoo();
                case 4: 
                    // Mostra quanto de água tem na máquina
                    verifyWater();
                case 5:
                    // Mostra quanto de shampoo tem na máquina
                    verifyShampoo();
                    break; // aqui tem break, então para a execução do switch
                case 6:
                    // Verifica se tem pet na máquina
                    checkIfhasPetInMachine();
                    break;
                case 7:
                    // Coloca um pet na máquina
                    setPetInPetMachine();
                    break;
                case 8:
                    // Retira o pet da máquina
                    petMachine.removePet();
                    break;
                case 9:
                    // Limpa a máquina
                    petMachine.wash();
                    break;
                case 0:
                    // Sai imediatamente do programa
                    System.exit(0);
                default:
                    // Caso o usuário digite algo fora das opções
                    System.out.println("Opção inválida");
            }

        } while (option != 10); // repete o menu até que o usuário digite 10

        System.out.println("Programa encerrado.");
    }
    
    // Método para abastecer a máquina com água
    private static void setWater() {
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }
    
    // Método para abastecer a máquina com shampoo
    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    // Método para verificar a quantidade de água
    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + "Litro(s) de água");
    }

    // Método para verificar a quantidade de shampoo
    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + "Litro(s) de shampoo");
    }

    // Método para verificar se há um pet dentro da máquina
    private static void checkIfhasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    // Método para colocar um pet dentro da máquina
    public static void setPetInPetMachine() {
        String name = ""; // nome do pet começa vazio
        while (name.isEmpty()) { // enquanto o usuário não digitar um nome válido
            System.out.print("Informe o nome do pet: ");
            name = scanner.next(); // lê o nome
        }

        // Cria um novo pet com o nome informado
        Pet pet = new Pet(name);
        
        // Coloca o pet dentro da máquina
        petMachine.setPet(pet);
        
        // Confirmação para o usuário
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

} 

// O do...while mantém o menu rodando até o usuário digitar 10.

// O switch chama os métodos certos dependendo da opção escolhida.

// Alguns case não têm break, então eles executam em "cascata" (1 → 2 → 3 → 4 → 5).

// Os métodos auxiliares (setWater, setShampoo, verifyWater, etc.) 
// ó servem para organizar melhor o código 
//  e não deixar tudo dentro do switch.
// cascata (ou fall-through), porque os case vão "caindo" um dentro do outro.